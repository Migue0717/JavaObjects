package co.com.beans;

import java.util.HashMap;

public class Coordinador extends Persona{

	private int id;
	private String Nombre; 
	private HashMap<String, Instructor> instructores;
	
	public Coordinador() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int idC) {
		this.id = idC;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nom) {
		this.Nombre = nom;
	}
	
	public HashMap<String, Instructor> getListaInstructores(){
		return instructores;
	}
	
	public void setListaInstructores(HashMap<String, Instructor> listaI){
		this.instructores = listaI;
	}
}
