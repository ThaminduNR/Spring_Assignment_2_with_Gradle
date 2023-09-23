package lk.ijse.gdse.assignment02.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.UUID;

/*
 * Author  : Thamindu Ranawaka
 * Date    : 9/21/2023
 * Project : Assignment-2-Gradle
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class TL {
    @Id
    private UUID tlId;

    private String tlName;

    private String tlEmail;

    @OneToMany(mappedBy = "tl",cascade = CascadeType.DETACH)
    private List<Project> projects;
}
