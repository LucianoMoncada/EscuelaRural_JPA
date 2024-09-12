package cl.praxis.EscuelaRural_JPA.model.service;

import cl.praxis.EscuelaRural_JPA.model.entity.Curso;

import java.util.List;

public interface ICursoService {

    List<Curso> findAll();
    Curso findOne(int id);
    boolean create(Curso sj);
    boolean update(Curso sj);
    boolean delete(int id);
}
