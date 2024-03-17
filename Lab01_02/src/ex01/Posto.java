package ex01;

public class Posto {
	
	public static void abastecerCarro(Carro carro, double qtdGas) {
		carro.setTanque(carro.getTanque()+qtdGas);
	}
	
	public static void abastecerTanque(double tanque, double qtdGas) {
		tanque += qtdGas;
	}
	
}
