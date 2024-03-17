package ex01;

public class Carro {
	
	private Pessoa dono;
	private Modelo modelo;
	private TanqueDeGasolina tanque;
	private double distanciaPorLitro;
	private double kilometragem = 0;
	
	public Carro(Modelo umModelo, double umDistanciaPorLitro, double limiteGasolina) {
		this.dono = null;
		this.modelo = umModelo;
		this.tanque = new TanqueDeGasolina(0, limiteGasolina);
		this.distanciaPorLitro = umDistanciaPorLitro;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public TanqueDeGasolina getTanque() {
		return tanque;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public double getDistanciaPorLitro() {
		return distanciaPorLitro;
	}
	
	public double getLimiteGasolina() {
		return getTanque().getLimiteGasolina();
	}
	
	public double getKilometragem() {
		return this.kilometragem;
	}
	
	public double addGasolina(double gasolina) {
		return getTanque().aumentaGasolina(gasolina);
	}
	
	public double anda(double kilometros) {
		double gasolinaGasta = calcGastoGasPorDistancia(kilometros);
		gasolinaGasta = getTanque().gastarGasolina(gasolinaGasta);
		double distanciaAndado = this.distanciaPorLitro*gasolinaGasta;
		kilometragem+=distanciaAndado;
		return distanciaAndado;
	}
	
	private double calcGastoGasPorDistancia(double kilometro) {
		return kilometro/this.distanciaPorLitro;
	}

	@Override
	public String toString() {
		String res = "";
		res += getClass().getName() + "\n";
		res += "Dono: " + dono + "\n";
		res += "Modelo: " + modelo + "\n";
		res += "tanque: " + tanque + "\n";
		res += "distancia por litro: " + distanciaPorLitro + "\n";
		res += "kilometragem: " + kilometragem + "\n";
		return res;
	}
	
}
