package ex01;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	

}
