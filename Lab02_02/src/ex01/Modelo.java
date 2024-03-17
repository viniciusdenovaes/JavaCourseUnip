package ex01;

public class Modelo {
	
	private String nome;
	private int ano;
	public Modelo(String nome, int ano) {
		this.nome = nome;
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public int getAno() {
		return ano;
	}
	@Override
	public String toString() {
		return "Modelo [nome=" + nome + ", ano=" + ano + "]";
	}
	

}
