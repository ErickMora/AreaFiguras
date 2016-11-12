package puntoXY;

public class Triangulo extends FiguraGeometrica{
	private Punto p1;
	private Punto p2;
	private Punto p3;
	
	public Triangulo(Punto punto, Punto punto2, Punto punto3) {
		// TODO Auto-generated constructor stub
		punto=new Punto(1,1);
		punto2=new Punto(1,2);
		punto3=new Punto(2,1);
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public Punto getP3() {
		return p3;
	}
	public void setP3(Punto p3) {
		this.p3 = p3;
	}
	
	@Override
	public String toString(){
		return "Punto1: (" + p1 + ");" + " Punto2: (" + p2 + ")" + " Punto3: (" + p3 + ")";
		
	}

}
