package ex02;

import java.util.ArrayList;
import java.util.List;

public class Cuidador {
	
	private String nome;
	private List<Cachorro> cachorros;
	private List<Gato> gatos;
	private List<Pato> patos;
	
	public Cuidador(String nome) {
		this.nome = nome;
		this.cachorros = new ArrayList<>();
		this.gatos = new ArrayList<>();
		this.patos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public List<Cachorro> getCachorros() {
		return cachorros;
	}

	public List<Gato> getGatos() {
		return gatos;
	}

	public List<Pato> getPatos() {
		return patos;
	}
	
	public void addCachorro(Cachorro cachorro) {
		cachorros.add(cachorro);
	}
	public void addGato(Gato gato) {
		gatos.add(gato);
	}
	public void addPato(Pato pato) {
		patos.add(pato);
	}

	@Override
	public String toString() {
		return "\nCuidador [nome=" + nome + "\n"
				+ "cachorros=" + cachorros + "\n"
				+ "gatos=" + gatos + "\n"
				+ "patos=" + patos + "\n";
	}
	
	
	
	

	
	
	
	
	
	
}
