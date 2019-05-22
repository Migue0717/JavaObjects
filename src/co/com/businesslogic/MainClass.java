package co.com.businesslogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

import co.com.beans.Aprendiz;
import co.com.beans.Competencia;
import co.com.beans.Coordinador;
import co.com.beans.Ficha;
import co.com.beans.Instructor;
import co.com.beans.ProgramaF;

public class MainClass {

	public static void main(String[] args) {

		Aprendiz pedro = new Aprendiz(1,"Andres","Soto","123");
		Aprendiz juan = new Aprendiz(2,"Juan","Palacios","321");
		Aprendiz paco = new Aprendiz(3,"Kevin","Lopiz","1321");
		
		ArrayList<Aprendiz> lista = new ArrayList <Aprendiz>();
		lista.add(pedro);
		lista.add(juan);
		lista.add(paco);
		
		Ficha ficha = new Ficha();
		ficha.setID(1598765);
		ficha.setTipo("Tecnologia");
		ficha.setListaAprendices(lista);
		
		Competencia comp1 = new Competencia(12, "TIC");
		Competencia comp2 = new Competencia(43, "Ambiental");
		
		ArrayList<Competencia> listaC = new ArrayList <Competencia>();
		listaC.add(comp1);
		listaC.add(comp2);
		
		ProgramaF prog = new ProgramaF();
		prog.setName("Adsi");
		prog.setDesc("Analisis y desarrollo");
		prog.setListaCompetencia(listaC);
		
		Instructor edwin = new Instructor();
		edwin.setId(1);
		edwin.setNombre("Edwin P");
		
		Instructor jose = new Instructor();
		jose.setId(3);
		jose.setNombre("Jose");
		
		Instructor Aharon = new Instructor();
		Aharon.setId(8);
		Aharon.setNombre("Aharon");
		
		HashMap<String, Instructor> listaI = new HashMap<String, Instructor>();
		listaI.put("1",jose);
		listaI.put("2",edwin);
		listaI.put("3",Aharon);
		
		Coordinador coor = new Coordinador();
		coor.setId(121);
		coor.setNombre("Eldrim");
		coor.setListaInstructores(listaI);
		coor.setTelefono("123");
		coor.setDireccion("Bello");
		coor.setCorreo("Sena");
		
		
		/*
		JOptionPane.showMessageDialog(null,"ID Coordinador: " + coor.getId() +
				"\nNombre Coordinador: " + coor.getNombre() +
				"\nTelefono Coordinador: " + coor.getTelefono() +
				"\nDirección Coordinador: " + coor.getDireccion() +
				"\nCorreo Coordinador: " + coor.getCorreo()
				);
		
		JOptionPane.showMessageDialog(null,"Instructores" +
		"\nID:" + coor.getListaInstructores().get("1").getId() +
		"\nNombre:" + coor.getListaInstructores().get("1").getNombre() +
		"\n\nID:" + coor.getListaInstructores().get("2").getId() +
		"\nNombre:" + coor.getListaInstructores().get("2").getNombre() +
		"\n\nID:" + coor.getListaInstructores().get("3").getId() +
		"\nNombre:" + coor.getListaInstructores().get("3").getNombre());
		
		JOptionPane.showMessageDialog(null,"Nombre Programa: " + prog.getName() +
				"\nDescripción Programa: " + prog.getDesc()
				);
		
		JOptionPane.showMessageDialog(null,"ID Ficha: " + ficha.getID() +
				"\nTipo Ficha: " + ficha.getTipo()
				);
		
		JOptionPane.showMessageDialog(null,"Competencias" + 
				"\nCodigo: " + prog.getlistaCompetencia().get(0).getCod() +
				"\nDescripcion: " + prog.getlistaCompetencia().get(0).getDes() +
				"\n\nCodigo: " + prog.getlistaCompetencia().get(1).getCod() +
				"\nDescripcion: " + prog.getlistaCompetencia().get(1).getDes()
				);
		*/

		//Metodo 1
		for (int i = 0; i < ficha.getlistaAprendices().size(); i++) {
			JOptionPane.showMessageDialog(null,"Aprendices" + 
					"\nID: " + ficha.getlistaAprendices().get(i).getId() +
					"\nNombre: " + ficha.getlistaAprendices().get(i).getNombre());
		}
		
		//Metodo 2
		for (Aprendiz temp : ficha.getlistaAprendices()) {
			JOptionPane.showMessageDialog(null,temp.getNombre());
		}
		
		//Metodo 3
		Iterator<Aprendiz> crunchifyIterator = ficha.getlistaAprendices().iterator();
		while (crunchifyIterator.hasNext()) {
			JOptionPane.showMessageDialog(null, crunchifyIterator.next().getapellidos());
		}
		
		//Metodo 4
		int i = 0;
		while (i < ficha.getlistaAprendices().size()) {
			JOptionPane.showMessageDialog(null,"Aprendices" + 
					"\nID: " + ficha.getlistaAprendices().get(i).getId() +
					"\nNombre: " + ficha.getlistaAprendices().get(i).getNombre() +
					"\nApellido: " + ficha.getlistaAprendices().get(i).getapellidos() +
					"\nTelefono: " + ficha.getlistaAprendices().get(i).gettelefono());
			i++;
		}
		
		//Metodo 5
		ficha.getlistaAprendices().forEach((temp) -> {
			JOptionPane.showMessageDialog(null,temp.getNombre());
		});
		
		
	}
	
	
	
	
	
	

}
