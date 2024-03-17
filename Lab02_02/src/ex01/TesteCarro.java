package ex01;

public class TesteCarro {
	
	public static void main(String[] args) {
		Carro c1 = new Carro(new Modelo("bmw", 1990), 5, 50);
		System.out.println(c1);
		
		Cartorio.mudaDono(c1, new Pessoa("Ana", "Beatriz"));
		
		for(int i=0; i<4; i++) {
			Posto.abastecerCarro(c1, 20);
		}
		
		for(int i=0; i<4; i++) {
			double km = 80;
			System.out.println("andando " + km);
			double kmAndado = c1.anda(km);
			System.out.println("conseguiu andar " + kmAndado);
			System.out.println(c1);
			System.out.println();
		}
		
	}

}
