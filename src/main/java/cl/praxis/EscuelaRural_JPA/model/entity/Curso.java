package cl.praxis.EscuelaRural_JPA.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "course")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private int id;
    private String title;


    @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
    private Set<Estudiante> students;
}
