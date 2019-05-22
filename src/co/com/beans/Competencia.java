package co.com.beans;

public class Competencia {
	
	
	private int codigo;
	private String Descripcion;
	
	public Competencia(int codigoC,String descripcionC) {
		
		this.codigo = codigoC;
		this.Descripcion = descripcionC;
		
	}
	
	//--------------------
	public int getCod() {
		return this.codigo;
		}
	
	public void set(int Cod) {
		 this.codigo = Cod; 
	}
	
	//---------------------
	
	public String getDes() {
		return this.Descripcion;
		}
	
	public void setDes(String Des) {
		 this.Descripcion = Des; 
	}

	
	//---------------------

	
	
	
}                           
