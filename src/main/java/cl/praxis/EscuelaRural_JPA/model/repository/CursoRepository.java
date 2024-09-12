package cl.praxis.EscuelaRural_JPA.model.repository;

import cl.praxis.EscuelaRural_JPA.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
