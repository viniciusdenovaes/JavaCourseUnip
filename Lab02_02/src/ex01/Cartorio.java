package ex01;

public class Cartorio {
	
	public static void mudaDono(Carro carro, Pessoa novoDono) {
		System.out.println("mudando dono do carro ");
		System.out.println(carro);
		System.out.println("para novo dono " + novoDono);
		carro.setDono(novoDono);
		
		System.out.println("\nResultado: ");
		System.out.println(carro);
	}

}
