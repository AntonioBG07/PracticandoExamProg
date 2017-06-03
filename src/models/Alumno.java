package models;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String edad;
	private String dni;
	private ArrayList<Integer> asig = new ArrayList<Integer>();
	
	
	public Alumno(String alumno, String apellidos, String edad, String dni, ArrayList<Integer> as) throws Exception {
		setAlumno(alumno);
		setApellidos(apellidos);
		setEdad(edad);
		setDni(dni);
		asig.addAll(as);
		
	}


	public String getAlumno() {
		return nombre;
	}

	public void setAlumno(String alumno) throws Exception {
		if(alumno.equals("")){
			throw new Exception("Vacío");
		}
		this.nombre = alumno;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) throws Exception {
		if(edad.equals("")){
			throw new Exception("Vacío");
		}
		this.edad = edad;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) throws Exception {
		if(apellidos.equals("")){
			throw new Exception("Vacío");
		}
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) throws Exception {
		if(dni.equals("")){
			throw new Exception("Vacío");
		}
		this.dni = dni;
	}
	
	public ArrayList<Integer> getAsignaturas() {
		return asig;
	}
	
	
	
	
}
