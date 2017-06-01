package models;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String edad;
	private String dni;
	private ArrayList<String> asignaturas = new ArrayList<String>();
	
	
	public Alumno(String alumno, String apellidos, String edad, String dni, ArrayList<String> as) {
		this.nombre = alumno;
		this.apellidos = apellidos;
		this.edad = edad;
		asignaturas.addAll(as);
		
	}


	public String getAlumno() {
		return nombre;
	}


	public void setAlumno(String alumno) {
		this.nombre = alumno;
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


	
	public String getDni() {
		return dni;
	}
	


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
}
