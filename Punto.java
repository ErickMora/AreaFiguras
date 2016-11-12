package puntoXY;

public class Punto {
	public static String punto;
	private int x;
	private int y;
	
	public Punto() {
		// TODO Auto-generated constructor stub
		x=0;
		y=0;
	}
	
	public Punto(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x_) {
		this.x = x_;
	}

	public int getY() {
		return y;
	}

	public void setY(int y_) {
		this.y = y_;
	}

	@Override
	public String toString(){
		return "x: " + x + "," + " y: " + y;
		
	}

/*	public String CalcularArea() {
		// TODO Auto-generated method stub
		return null;
	}*/
	
}
