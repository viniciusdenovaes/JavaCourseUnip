package ex01;

public class Posto {
	
	public static void abastecerCarro(Carro carro, double gasolina) {
		System.out.println("Tentando abastecer " + gasolina + " no carro");
		System.out.println(carro);
		
		double gasolinaAbastecida = carro.addGasolina(gasolina);
		
		System.out.println("Abastecido " + gasolinaAbastecida + " no carro");
		System.out.println(carro);
		
	}

}
