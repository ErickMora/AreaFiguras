package puntoXY;

public class Circulo extends FiguraGeometrica{
	private double radio;
	private Punto centro;

	/*public Circulo() {
		// TODO Auto-generated constructor stub
		centro=new Punto();
		radio=1;
		
	}*/
	
	public Circulo(Punto c, double r) {
		// TODO Auto-generated constructor stub
		centro=new Punto();
		radio=1;	
	}
	
	public Punto getCentro(){
		return centro;
	}
	
	public void setCentro(Punto c){
		centro=c;
		
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	

	@Override
	public String toString(){
		return "Centro: (" + centro + ");" + " Radio: " + radio;
		
	}
	

}
