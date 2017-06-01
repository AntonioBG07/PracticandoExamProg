package models;

import java.util.ArrayList;

public class Alumno {

	private String alumno;
	private String apellidos;
	private String edad;
	private String dni;
	private ArrayList<String> asignaturas;
	
	
	public Alumno(String alumno, String apellidos, String edad, String dni) {
		this.alumno = alumno;
		this.apellidos = apellidos;
		this.edad = edad;
		asignaturas = new ArrayList<String>();
	}


	public String getAlumno() {
		return alumno;
	}


	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public String getApellidos() {
		return apellidos;
	}
	
	
	
	
	
}
