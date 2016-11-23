package it.polito.tdp.rubricaModel;

public class Voce {
	
	private String nome;
	private String email;
	private String telefono;
	public Voce(String nome, String email, String telefono) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefono = telefono;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String toString(){
		String risu ="";
		risu = nome+" "+email+" "+telefono+" " +"\n";
		return risu;
	}
	
}