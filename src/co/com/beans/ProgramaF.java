package co.com.beans;

import java.util.ArrayList;

public class ProgramaF {
	private String nombreP;
	private String descripcionP;
	ArrayList<Competencia> competencia = new ArrayList<Competencia>();
	

	public ProgramaF (){
		
	}
	
	
	//--------------------
		public String getName() {
			return this.nombreP;
			}
		
		public void setName(String Name) {
			 this.nombreP = Name; 
		}
		
		//---------------------
		
		public String getDesc() {
			return this.descripcionP;
		}
		
		public void setDesc(String Desc) {
			this.descripcionP = Desc ;
		}

		//-----------------
		
		public ArrayList<Competencia> getlistaCompetencia(){
			
			return competencia;
			}
		
		//----------
			public void setListaCompetencia(ArrayList<Competencia> listaC) {
			this.competencia = listaC;
			}
		
		
		
}
