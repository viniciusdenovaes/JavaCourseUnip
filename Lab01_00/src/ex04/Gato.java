package ex04;

public class Gato {
	
	public String nome;
	public int idade;
	public double peso;
	
	public Gato(String aNome, double aPeso) {
		this.nome = aNome;
		this.idade = 0;
		this.peso = aPeso;
	}
	
	public void miar() {
		
		if(this.idade<3) {
			System.out.println("miau miau miau, meu nome é " + this.nome + ", eu tenho " + this.peso + " quilos");
		}else if(this.idade<=8) {
			System.out.println("miaaau, meu nome é " + this.nome + ", eu tenho " + this.peso + " quilos");
		}else {
			System.out.println("Grrr, meu nome é " + this.nome + ", eu tenho " + this.peso + " quilos");
		}
		
	}
	
	@Override
	public String toString(){
		String res = "";
		res += "Objeto Gato\n";
		res += "Nome: " + this.nome + "\n";
		res += "Idade: " + this.idade + "\n";
		res += "Peso: " + this.peso + "\n";
		return res;
	}
}
