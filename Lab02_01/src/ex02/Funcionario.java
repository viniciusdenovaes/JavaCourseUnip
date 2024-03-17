package ex02;

public class Funcionario {
	
	private String id;
	private String nome;
	private double salario;
	public Funcionario(String aId, String aNome, double aSalario) {
		super();
		this.id = aId;
		this.nome = aNome;
		this.salario = aSalario;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public void aumentaSalarioPorcentagem(double umPorcento) {
		double aumento = salario*(umPorcento/100.);
		salario += aumento;
	}
	
	public void aumentaSalarioAbsoluto(double umValor) {
		salario += umValor;
	}
	
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	

}
