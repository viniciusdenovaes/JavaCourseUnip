package ex02;

public class Gato {
	private String nome;
	private int idade;
	private double peso;
	private boolean isDoente;
	
	public Gato(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.isDoente = false;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public boolean getIsDoente() {
		return isDoente;
	}
	
	public void aumentaIdade() {
		idade++;
	}
	
	public void miar() {
		System.out.println("miaaauu");
	}
	
	public void dormir() {
		System.out.println("foi dormir no alto");
	}
	
	public void comer() {
		System.out.println("comendo racao de gato");
	}
	
	public void darInjecao() {
		isDoente = false;
	}
	
	public void adoecer() {
		isDoente = true;
	}

	@Override
	public String toString() {
		return getClass().getName() + "[nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", isDoente=" + isDoente + "]";
	}
	
	
	
}
