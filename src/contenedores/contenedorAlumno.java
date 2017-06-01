package contenedores;

import java.util.ArrayList;

import models.Alumno;

public class contenedorAlumno {

	private static contenedorAlumno contAlumno;
	ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public static contenedorAlumno getContenedorAlumno() {
		if (contAlumno == null) {
			contAlumno = new contenedorAlumno();
		}
		return contAlumno;
	}
	
	public void aniadirAlumno(Alumno a){
		System.out.println("Entra en contenedor");
		alumnos.add(a);
		System.out.println("Exito");
		
	}
	
	public void borrarAlumno(Alumno a){
		alumnos.remove(a);
	}
	
	
	
	
}
