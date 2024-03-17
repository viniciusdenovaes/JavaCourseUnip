package ex01;

public class TesteCachorro {
	
	public static void main(String[] args) {
		
		Cachorro c01 = new Cachorro("Brutus", 22);
		
		System.out.println(c01);
		
		for(int i=0; i<3; i++) {
			System.out.println("Aumentando a idade do cachorro pelo " + (i+1) + "esima vez");
			c01.aumentaIdade();
			System.out.println(c01);
		}
		
		
	}

}
