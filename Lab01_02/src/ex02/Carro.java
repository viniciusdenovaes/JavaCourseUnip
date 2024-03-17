package ex02;

public class Carro {
	
	private Pessoa dono;
	private int ano;
	
	public Carro(Pessoa aDono, int aAno) {
		this.dono = aDono;
		this.ano = aAno;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		String res = "";
		res += getClass().getName() + "\n";
		res += "Dono: " + dono + "\n";
		res += "Ano: " + ano + "\n";
		return res;
	}
	
	
	
	

}
