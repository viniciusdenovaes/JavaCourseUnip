package ex03;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String id;
	private String nome;
	private List<Rendimento> historico;
	public Aluno(String id, String nome) {
		this.id = id;
		this.nome = nome;
		this.historico = new ArrayList<>();
	}
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public List<Rendimento> getHistorico() {
		return historico;
	}
	public void addRendimento(Rendimento rendimento) {
		this.historico.add(rendimento);
	}
	
	public void fazRelatorio() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += getClass().getName() + "\n";
		res += "Id: " + id + "\n";
		res += "Nome: " + nome + "\n";
		res += "Historico: \n";
		for(Rendimento r: historico) {
			res += r + "\n";
		}
		res += "\n";
		return res;
	}
	
	

}
