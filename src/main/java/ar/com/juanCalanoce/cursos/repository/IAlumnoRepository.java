package ar.com.juanCalanoce.cursos.repository;

import ar.com.juanCalanoce.cursos.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno, Long> {
}
