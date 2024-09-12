package cl.praxis.EscuelaRural_JPA.model.repository;

import cl.praxis.EscuelaRural_JPA.model.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
