package controlador;

import GUI.VentanaFormulario;
import contenedores.contenedorAlumno;
import models.Alumno;

public class ControladorAlumnos {
	
	private VentanaFormulario form;

	public void guardarVehiculo(){
		contenedorAlumno.getContenedorAlumno().aniadirAlumno(new Alumno(form.getNombre(), form.getApellidos(), form.getEdad(), form.getDni()));
		
		
		
	}
	
}
