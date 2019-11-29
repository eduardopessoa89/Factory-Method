package br.ufpb.dcx.factorymethod;

public class Grife {
	
	String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	
	public String Apresentacao() {
		return "A Grife é "+ this.nome;
	}

}
