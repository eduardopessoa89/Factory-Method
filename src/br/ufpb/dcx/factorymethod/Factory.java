package br.ufpb.dcx.factorymethod;

public class Factory {

	public Grife criaGrife(String nome) {
		if ( nome == "Gucci") {
			return new Gucci(nome);
		}else if ( nome == "Versace") {
			return new Versace(nome);
		}else if ( nome == "Coco Chanel") {
			return new CocoChanel(nome);
		}
		
		return null;
	}
	
}
