package contenedores;

import java.util.ArrayList;

import models.Alumno;

public class contenedorAlumno {

	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public void aniadirAlumno(Alumno a){
		alumnos.add(a);
		
	}
	
	public void borrarAlumno(Alumno a){
		alumnos.remove(a);
	}
	
	
	
}
