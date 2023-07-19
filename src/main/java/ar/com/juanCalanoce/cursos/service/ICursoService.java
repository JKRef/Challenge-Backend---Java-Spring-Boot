package ar.com.juanCalanoce.cursos.service;

import ar.com.juanCalanoce.cursos.entity.Curso;
import ar.com.juanCalanoce.cursos.entity.Profesor;
import ar.com.juanCalanoce.cursos.exceptions.MiException;

import java.util.List;

public interface ICursoService {

    public List<Curso> getCursos();

    public void saveCurso(Curso curso) throws MiException;

    public void deleteCurso(Long id_curso);

    public Curso findCurso(Long id_curso);

    public void editCurso(Long id_curso, String nuevoNombre, String nuevaDescripcion, String nuevoTurno, Profesor unProfesor) throws MiException;
}
