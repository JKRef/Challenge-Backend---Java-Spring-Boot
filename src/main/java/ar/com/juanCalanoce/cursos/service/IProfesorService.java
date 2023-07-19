package ar.com.juanCalanoce.cursos.service;

import ar.com.juanCalanoce.cursos.entity.Profesor;
import ar.com.juanCalanoce.cursos.exceptions.MiException;

import java.util.List;

public interface IProfesorService {

    public List<Profesor> getProfesores();

    public void saveProfesor(Profesor profesor) throws MiException;

    public void deleteProfesor(Long id_profesor);

    public Profesor findProfesor(Long id_profesor);

    public void editProfesor(Long id_profesor, String nuevoNombre, String nuevoEmail) throws MiException;
}
