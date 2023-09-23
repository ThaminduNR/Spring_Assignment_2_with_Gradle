package lk.ijse.gdse.assignment02.service.impl;
/*
 * Author  : Thamindu Ranawaka
 * Date    : 9/21/2023
 * Project : Assignment-2-Gradle
 */

import lk.ijse.gdse.assignment02.dto.ProjectDto;
import lk.ijse.gdse.assignment02.entity.Project;
import lk.ijse.gdse.assignment02.repositry.ProjectRepo;
import lk.ijse.gdse.assignment02.service.ProjectService;
import lk.ijse.gdse.assignment02.util.NotFoundException;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepo projectRepo;

    private final ModelMapper modelMapper;

    public ProjectServiceImpl(ProjectRepo projectRepo,ModelMapper modelMapper) {
        this.projectRepo = projectRepo;
        this.modelMapper = modelMapper;

    }

    @Override
    public ProjectDto add(ProjectDto projectDto) {
        try {
            Project save = projectRepo.save(modelMapper.map(projectDto, Project.class));
            return modelMapper.map(save, ProjectDto.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean delete(UUID uuid) {
        try {
            projectRepo.deleteById(uuid);
            return true;
        } catch (NotFoundException e) {
            throw new NotFoundException(e.getMessage());
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public ProjectDto update(ProjectDto projectDto) {
        try {
            if (projectRepo.existsById(projectDto.getProjectId())) {
                Project save = projectRepo.save(modelMapper.map(projectDto, Project.class));
                return modelMapper.map(save, ProjectDto.class);
            } else {
                throw new NotFoundException("Project not found");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public ProjectDto search(UUID uuid) {
        try {
            if (projectRepo.existsById(uuid)) {
                return modelMapper.map(projectRepo.findById(uuid), ProjectDto.class);
            } else {
                throw new NotFoundException("Project not found");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<ProjectDto> getAll() {
        try {
            List<Project> all = projectRepo.findAll();

            return  all.stream().map(project ->
                            modelMapper.map(project, ProjectDto.class))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
