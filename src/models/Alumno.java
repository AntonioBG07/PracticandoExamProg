package models;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String edad;
	private String dni;
	private ArrayList<Integer> asig = new ArrayList<Integer>();
	
	
	public Alumno(String alumno, String apellidos, String edad, String dni, ArrayList<Integer> as) {
		this.nombre = alumno;
		this.apellidos = apellidos;
		this.edad = edad;
		asig.addAll(as);
		
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
	
	public ArrayList<Integer> getAsignaturas() {
		return asig;
	}
	
	
	
}
