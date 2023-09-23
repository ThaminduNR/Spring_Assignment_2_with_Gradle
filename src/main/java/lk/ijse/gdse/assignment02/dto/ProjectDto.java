package lk.ijse.gdse.assignment02.dto;

import lk.ijse.gdse.assignment02.entity.TL;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

/*
 * Author  : Thamindu Ranawaka
 * Date    : 9/21/2023
 * Project : Assignment-2-Gradle
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDto {
    private UUID projectId;

    private String projectName;

    private String projectDeadline;

    private String projectStatus;

    @ToString.Exclude
    private TL tl;
}
