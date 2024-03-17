package ex02;

public class TestaCuidador {
	
	public static void main(String[] args) {
		Cuidador cuidador = new Cuidador("Billy");
		
		cuidador.addCachorro(new Cachorro("Brutus", 5, 2));
		cuidador.addCachorro(new Cachorro("Rex", 15, 20));
		
		cuidador.addGato(new Gato("Chirriro", 12, 5));
		cuidador.addGato(new Gato("Xitara", 7, 2));
		
		System.out.println(cuidador);
		System.out.println();
		
		for(Cachorro c: cuidador.getCachorros()) {
			c.adoecer();
		}
		
		System.out.println(cuidador);
		System.out.println();
		
		for(Cachorro c: cuidador.getCachorros()) {
			Veterinario.cuidaDoCachorro(c);
		}
		
		for(Gato g: cuidador.getGatos()) {
			Veterinario.cuidaDoGato(g);
		}
		
		for(Pato p: cuidador.getPatos()) {
			Veterinario.cuidaDoPato(p);
		}
		
		
	}

}
