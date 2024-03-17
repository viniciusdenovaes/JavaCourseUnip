package ex02;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Pessoa dono = new Pessoa("Cormac", "McCarthy");
		Carro c01 = new Carro(dono, 2020);
		
		System.out.println("\nCarro criado:");
		System.out.println(c01);
		
		Cartorio.mudaDonoCarro(c01, new Pessoa("Philip", "Roth"));
		
		System.out.println("\nDepois de mudar o dono com mudaDonoCarro:");
		System.out.println(c01);
		
		Cartorio.mudaDono(c01.getDono(), new Pessoa("Don", "DeLilo"));
		
		System.out.println("\nDepois de mudar o dono com mudaDono:");
		System.out.println(c01);
		
	}

}
