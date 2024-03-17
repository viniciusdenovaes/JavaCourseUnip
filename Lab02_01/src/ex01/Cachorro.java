package ex01;

public class Cachorro {
	
	private String nome;
	private int idade;
	private double peso;
	
	public Cachorro(String aNome, double aPeso) {
		super();
		this.nome = aNome;
		this.idade = 0;
		this.peso = aPeso;
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
	
	public void aumentaIdade() {
		idade++;
	}

	@Override
	public String toString() {
		String res = "";
		res += getClass().getName() + "\n";
		res += "Nome: " + nome + "\n";
		res += "Idade: " + idade + "\n";
		return res;
	}
	
	
	
	

}
