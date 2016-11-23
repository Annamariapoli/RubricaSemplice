package it.polito.tdp.rubricaModel;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List<Voce> voci = new LinkedList <Voce>();
	
	
	public void addVoce(Voce voce){
			if(!voci.contains(voce)){
				voci.add(voce);
			}
	}
	
	public Voce cerca(String nome, String email, String telefono){   //si pero non riempe i campi nel controller
		for(Voce v : voci){
			if(v.getNome().equals(nome) || v.getEmail().equals(email) || v.getTelefono().equals(telefono)){
				System.out.println(v);
				return v;                         //qui funziona
			}
		}
	//	System.out.println("null");
		return null;
	}
	
	public void stampa(){
		System.out.println(voci);
	}
	
	public static void main(String [] args){
		Model m = new Model();
		
		Voce v1 = new Voce ("anna", "annapolito", "1111");
		Voce v2 = new Voce ("luca", "lucapolito", "2222");
		Voce v3 = new Voce ("marco", "marcopolito", "3333");
		Voce v4 = new Voce ("ale", "alepolito", "4444");
		Voce v5 = new Voce ("ale", "alepolito", "4444");        //la aggiunge
		
		m.addVoce(v1);
		m.addVoce(v2);
		m.addVoce(v3);
		m.addVoce(v4);

		m.addVoce(v5);
		m.stampa();
		m.cerca(null, null, null);
		
	}

}
