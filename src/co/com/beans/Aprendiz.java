package co.com.beans;

public class Aprendiz {
	
	private int id;
	private String nombres;
	private String apellidos;
	private String telefono;
	

	public Aprendiz() {
		

	}


	public Aprendiz(int id,String nombresA,String apellidosA,String telA) {
	
		this.id = id; 
		this.nombres = nombresA;
		this.apellidos = apellidosA;
		this.telefono = telA;
	}
	
	
	public void  setId(int idA) {
		this.id = idA;
	}
	
	//------------------------

	public String getNombre() {
		return this.nombres; 
	}
	
	public void  setNombre(String nombreA) {
		this.nombres= nombreA;
		}
	
	//------------------------
	
	public int getId() {
		return this.id;
	}
	
	public void setid(int Id) {
		this.id = Id;
		}
	
	//------------------------

	public String getapellidos() {
		return this.apellidos;
	}
	
	public void setapellido(int Id) {
		this.id = Id;
		}
	
	//------------------------
	public String gettelefono() {
		return this.telefono;
	}
	
	public void settelefono(int Id) {
		this.id = Id;
		}
	//------------------------
	
	
	
}