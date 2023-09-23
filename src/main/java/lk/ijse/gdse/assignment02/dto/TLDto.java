package lk.ijse.gdse.assignment02.dto;

import lk.ijse.gdse.assignment02.entity.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

/*
 * Author  : Thamindu Ranawaka
 * Date    : 9/21/2023
 * Project : Assignment-2-Gradle
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TLDto {

    private UUID tlId;

    private String tlName;

    private String tlEmail;

    private List<Project> projects;}
