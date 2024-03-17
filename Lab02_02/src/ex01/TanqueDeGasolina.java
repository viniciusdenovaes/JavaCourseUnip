package ex01;

public class TanqueDeGasolina {
	
	private double quantidadeGasolina;
	private double limiteGasolina;
	
	public TanqueDeGasolina(double quantidadeGasolina, double limiteGasolina) {
		this.quantidadeGasolina = quantidadeGasolina;
		this.limiteGasolina = limiteGasolina;
	}

	public double getQuantidadeGasolina() {
		return quantidadeGasolina;
	}

	public double getLimiteGasolina() {
		return limiteGasolina;
	}
	
	public double aumentaGasolina(double gasolina) {
		double gasolinaResultante = Math.min(this.quantidadeGasolina+gasolina, this.limiteGasolina);
		double gasolinaGanha = gasolinaResultante - this.quantidadeGasolina;
		this.quantidadeGasolina = gasolinaResultante;
		return gasolinaGanha;
	}
	
	public double gastarGasolina(double gasolina) {
		double gasolinaGasta = Math.min(gasolina, this.quantidadeGasolina);
		this.quantidadeGasolina -= gasolinaGasta;
		return gasolinaGasta;
	}

	@Override
	public String toString() {
		return "TanqueDeGasolina [quantidadeGasolina=" + quantidadeGasolina + ", limiteGasolina=" + limiteGasolina
				+ "]";
	}
	
	

}
