package br.ufpb.dcx.factorymethod;

public class Main {
	public static void main(String [] args) {
		
		Factory factory = new Factory();
		
		Grife gucci = factory.criaGrife("Gucci");
		Grife versace = factory.criaGrife("Versace");
		Grife cocoChanel = factory.criaGrife("Coco Chanel");
		
		System.out.println(gucci.Apresentacao());
		System.out.println(versace.Apresentacao());
		System.out.println(cocoChanel.Apresentacao());
		
		
		
	}
	
}
