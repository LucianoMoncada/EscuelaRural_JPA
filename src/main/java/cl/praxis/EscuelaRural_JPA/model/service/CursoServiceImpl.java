package cl.praxis.EscuelaRural_JPA.model.service;

import cl.praxis.EscuelaRural_JPA.model.entity.Curso;
import cl.praxis.EscuelaRural_JPA.model.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    CursoRepository repository;

    public CursoServiceImpl(CursoRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Curso> findAll() {
        return repository.findAll();
    }

    @Override
    public Curso findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Curso sj) {
        Curso course = repository.save(sj);
        System.out.println("creado el id " + course.getId());

        return course != null;
    }

    @Override
    public boolean update(Curso sj) {
        Curso course = repository.save(sj);
        return course != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = repository.existsById(id);
        if (exist){
            repository.deleteById(id);
        }
        return exist;
    }
}
