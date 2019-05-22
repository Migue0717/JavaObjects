package co.com.beans;

import java.util.ArrayList;

public class Ficha {

	private int id;
	private String tipo;
	private ArrayList <Aprendiz> aprendices; 
			
	
	
	
	public Ficha() {
		
        aprendices = new ArrayList<Aprendiz>();
		Aprendiz juan = new Aprendiz();
		juan.setId(10);
		aprendices.add(juan);
		
	}
	
	
	//----------------------------
	
		public ArrayList<Aprendiz> getlistaAprendices(){
		
		return aprendices;
		}
	
	//----------
		public void setListaAprendices(ArrayList<Aprendiz> lista) {
		this.aprendices = lista;
		}
		
		//---------------------
		public int getID() {
			return this.id;
			}
		
		public void setID(int idF) {
			 this.id = idF; 
		}
		
		//---------------------
	
		public String getTipo() {
			return this.tipo;
			}
		
		public void setTipo(String tipoF) {
			 this.tipo = tipoF; 
		}
		
		//---------------------
	
	
	
}
