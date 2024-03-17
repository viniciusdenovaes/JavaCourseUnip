package ex03;

public class Materia {
	
	private String nome;
	private int ano;
	public Materia(String nome, int ano) {
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
		return "Materia [nome=" + nome + ", ano=" + ano + "]";
	}
	

}
