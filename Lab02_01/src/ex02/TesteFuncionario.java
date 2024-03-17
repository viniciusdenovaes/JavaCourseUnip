package ex02;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f01 = new Funcionario("123", "Ana", 2000);
		System.out.println(f01);
		
		f01.aumentaSalarioPorcentagem(10);
		System.out.println(f01);
		
		f01.aumentaSalarioAbsoluto(10);
		System.out.println(f01);
		
	}

}
