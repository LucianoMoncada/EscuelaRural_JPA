package cl.praxis.EscuelaRural_JPA.model.service;

import cl.praxis.EscuelaRural_JPA.model.entity.Estudiante;
import cl.praxis.EscuelaRural_JPA.model.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    EstudianteRepository repository;
    CursoServiceImpl courseService;

    public EstudianteServiceImpl(EstudianteRepository repository, CursoServiceImpl courseService) {
        this.repository = repository;
        this.courseService = courseService;
    }

    @Override
    public List<Estudiante> findAll() {
        return repository.findAll();
    }

    @Override
    public Estudiante findOne(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Estudiante s) {
        Estudiante student = repository.save(s);
        System.out.println("Creado el id " + student.getId());

        return student != null;
    }

    @Override
    public boolean update(Estudiante s) {
        Estudiante student = repository.save(s);
        return student != null;
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
