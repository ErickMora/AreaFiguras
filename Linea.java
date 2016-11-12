package puntoXY;

public class Linea{
	private Punto p1;
	private Punto p2;
	
	public Linea(Punto punto, Punto punto2) {
		// TODO Auto-generated constructor stub
		punto=new Punto(0,0);
		punto2=new Punto(1,0);
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

	@Override
	public String toString(){
		return "Punto1: (" + p1 + ");" + " Punto2: (" + p2 + ")" ;
		
	}


}
