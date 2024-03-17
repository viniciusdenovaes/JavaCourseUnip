package ex01;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro c01 = new Carro("bmw", 2010, 10);
		
		System.out.println("\nCarro criado:");
		System.out.println(c01);
		
		Posto.abastecerCarro(c01, 25);
		
		System.out.println("\nDepois de abastecer com abastecerCarro:");
		System.out.println(c01);
		
		Posto.abastecerTanque(c01.getTanque(), 25);
		
		System.out.println("\nDepois de abastecer com abastecerTanque:");
		System.out.println(c01);
		
	}

}
