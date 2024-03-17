package ex03;

public class Nota {
	
	private double np1;
	private double np2;
	private double exame;
	
	public Nota(double np1, double np2, double exame) {
		this.np1 = np1;
		this.np2 = np2;
		this.exame = exame;
	}

	public double getNp1() {return np1;}
	public double getNp2() {return np2;}
	public double getExame() {return exame;}
	public void setNp1(double np1) {this.np1 = np1;}
	public void setNp2(double np2) {this.np2 = np2;}
	public void setExame(double exame) {this.exame = exame;}

	public double getMediaSemExame() {
		return (np1+np2)/2;
	}
	public double getMediaComExame() {
		return (getMediaSemExame()+exame)/2;
	}

	@Override
	public String toString() {
		return "Nota [np1=" + np1 + ", np2=" + np2 + ", exame=" + exame + "]";
	}
	
}
