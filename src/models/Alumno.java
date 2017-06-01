package models;

import java.util.ArrayList;

public class Alumno {

	private String alumno;
	private String apellidos;
	private int edad;
	private String dni;
	private ArrayList<String> asignaturas;
	
	
	public Alumno(String alumno, String apellidos, int edad, String dni) {
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getApellidos() {
		return apellidos;
	}
	
	
	
	
	
}
