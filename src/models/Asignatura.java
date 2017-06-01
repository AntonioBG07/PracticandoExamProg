package models;

public class Asignatura {

	private int[] codAsig;;
	private String dniAlumno;
	
	
	public int[] getCodAsig() {
		return codAsig;
	}
	public String getDniAlumno() {
		return dniAlumno;
	}
	
	
	public Asignatura(int[] codAsig, String dniAlumno) {
		this.codAsig = codAsig;
		this.dniAlumno = dniAlumno;
	}
	
	
	
	
	
}
