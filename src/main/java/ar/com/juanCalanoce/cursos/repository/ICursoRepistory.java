package ar.com.juanCalanoce.cursos.repository;

import ar.com.juanCalanoce.cursos.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepistory extends JpaRepository<Curso, Long> {
}
