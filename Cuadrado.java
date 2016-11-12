package puntoXY;

public class Cuadrado extends FiguraGeometrica{
	private Punto p1;
	private Punto p2;
	private Punto p3;
	private Punto p4;
	
	public Cuadrado(Punto punto, Punto punto2, Punto punto3, Punto punto4) {
		// TODO Auto-generated constructor stub
		punto=new Punto(0,0);
		punto2=new Punto(1,0);
		punto3=new Punto(0,1);
		punto4=new Punto(1,1);
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
	public Punto getP4() {
		return p4;
	}
	public void setP4(Punto p4) {
		this.p4 = p4;
	}
	
	@Override
	public String toString(){
		return "Punto1: (" + p1 + ");" + " Punto2: (" + p2 + ")" + " Punto3: (" + p3 + ");" + " Punto4: (" + p4 + ")";
		
	}	
	

}
