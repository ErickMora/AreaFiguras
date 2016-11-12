package puntoXY;

public class FiguraGeometrica {
	
	public double CalcularArea(Triangulo tri){
		double area=0;
		double det=0;		
		double matrizTri[][]={{tri.getP1().getX(),tri.getP1().getY(),1},{tri.getP2().getX(),tri.getP2().getY(),1},{tri.getP3().getX(),tri.getP3().getY(),1}};
			
		det=Math.abs(((matrizTri[0][0]*matrizTri[1][1]*matrizTri[2][2])+(matrizTri[0][1]*matrizTri[1][2]*matrizTri[2][1])+(matrizTri[1][0]*matrizTri[2][1]*matrizTri[0][1]))-
				((matrizTri[2][0]*matrizTri[1][1]*matrizTri[0][2])+(matrizTri[1][0]*matrizTri[0][1]*matrizTri[2][2])+(matrizTri[2][1]*matrizTri[1][2]*matrizTri[0][0])));
		area=(0.5)*det;
		
		return area;
	}
	
	public double CalcularArea(Cuadrado cua){
		double area=0;
		double lado=0;
		
		lado=Math.sqrt( Math.pow((cua.getP4().getX()-cua.getP1().getX()), 2) + Math.pow((cua.getP4().getY()-cua.getP1().getY()), 2) );
		area=Math.pow(lado, 2);
		
		return area;
	}
	
	public double CalcularArea(Rectangulo rec){
		double area=0;
		double base=0;
		double altura=0;
		
		base=Math.sqrt( Math.pow((rec.getP4().getX()-rec.getP1().getX()), 2) + Math.pow((rec.getP4().getY()-rec.getP1().getY()), 2) );
		altura=Math.sqrt( Math.pow((rec.getP2().getX()-rec.getP1().getX()), 2) + Math.pow((rec.getP2().getY()-rec.getP1().getY()), 2) );
		area=base*altura;

		return area;
	}
	
	public double CalcularArea(Circulo c){
		double area=0;
		c.getRadio();
		area=Math.PI*(Math.pow(c.getRadio(),2));
		return area;
	}
	
}
