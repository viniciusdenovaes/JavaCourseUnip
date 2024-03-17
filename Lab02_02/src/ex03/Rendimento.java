package ex03;

public class Rendimento {
	
	private Materia materia;
	private Nota notas;
	public Rendimento(Materia materia, Nota notas) {
		this.materia = materia;
		this.notas = notas;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Nota getNotas() {
		return notas;
	}
	public void setNota(Nota notas) {
		this.notas = notas;
	}
	
	public boolean getAprovacao() {
		return (notas.getMediaSemExame()>=7) || (notas.getMediaComExame()>=5);
	}
	@Override
	public String toString() {
		return "Rendimento [materia=" + materia + ", nota=" + notas + ", Aprovado=" + getAprovacao() + "]";
	}
	
	

}
