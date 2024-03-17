package ex02;

public class Cartorio {
	
	public static void mudaDonoCarro(Carro carro, Pessoa novoDono) {
		carro.setDono(novoDono);
	}

	public static void mudaDono(Pessoa donoAntigo, Pessoa novoDono) {
		donoAntigo = novoDono;
	}
}
