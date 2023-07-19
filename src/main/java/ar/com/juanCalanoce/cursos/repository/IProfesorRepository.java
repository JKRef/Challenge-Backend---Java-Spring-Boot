package ar.com.juanCalanoce.cursos.repository;

import ar.com.juanCalanoce.cursos.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor, Long> {
}
