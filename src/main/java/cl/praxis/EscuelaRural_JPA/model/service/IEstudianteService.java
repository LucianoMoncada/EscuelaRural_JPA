package cl.praxis.EscuelaRural_JPA.model.service;

import cl.praxis.EscuelaRural_JPA.model.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> findAll();
    Estudiante findOne(int id);
    boolean create(Estudiante s);
    boolean update(Estudiante s);
    boolean delete(int id);
}
