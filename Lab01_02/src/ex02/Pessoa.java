package ex02;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	
	public Pessoa(String aNome, String aSobrenome) {
		this.nome = aNome;
		this.sobrenome = aSobrenome;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	@Override
	public String toString() {
		String res = "";
		res += getClass().getName() + ":\n";
		res += "Nome: " + nome + "\n";
		res += "Sobrenome: " + sobrenome + "\n";
		return res;
	}
	
}
