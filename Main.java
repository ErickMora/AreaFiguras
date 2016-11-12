package puntoXY;

import java.io.IOException;

public class Main {

	public static void main(String args[]) throws IOException
	{
		Punto objPunto=new Punto();
		Punto objPunto2=new Punto();
		Punto objPunto3=new Punto();
		Punto objPunto4=new Punto();
		Punto objPunto5=new Punto();
		Punto objPunto6=new Punto();

		Circulo c=new Circulo(new Punto(0,0), 1);
		Linea l=new Linea(new Punto(0,0), new Punto(1,0));
		Cuadrado cua=new Cuadrado(new Punto(0,0), new Punto(1,0), new Punto(0,1), new Punto(1,1));
		Rectangulo rec=new Rectangulo(new Punto(0,0), new Punto(1,0), new Punto(0,1), new Punto(1,1));
		Triangulo tri=new Triangulo(new Punto(0,0), new Punto(0,1), new Punto(0,1));

		objPunto.setX(1);
		objPunto.setY(1);
		objPunto2.setX(1);
		objPunto2.setY(2);
		objPunto3.setX(2);
		objPunto3.setY(2);
		objPunto4.setX(2);
		objPunto4.setY(1);
		objPunto5.setX(3);
		objPunto5.setY(2);
		objPunto6.setX(3);
		objPunto6.setY(1);

		c.setRadio(2.0);
		c.setCentro(objPunto);

		l.setP1(objPunto);
		l.setP2(objPunto2);

		cua.setP1(objPunto);
		cua.setP2(objPunto2);
		cua.setP3(objPunto3);
		cua.setP4(objPunto4);

		rec.setP1(objPunto);
		rec.setP2(objPunto2);
		rec.setP3(objPunto5);
		rec.setP4(objPunto6);

		tri.setP1(objPunto);
		tri.setP2(objPunto2);
		tri.setP3(objPunto4);

		System.out.println("Punto: " + objPunto.toString());
		System.out.println("Línea: " + l.toString());
		System.out.println("Círculo: " + c.toString());
		System.out.println("Cuadrado: " + cua.toString());
		System.out.println("Rectángulo: " + rec.toString());
		System.out.println("Triángulo: " + tri.toString());

		System.out.println("Área Círculo: " + c.CalcularArea(c));
		System.out.println("Área Rectángulo: " + rec.CalcularArea(rec));
		System.out.println("Área Cuadrado: " + cua.CalcularArea(cua));
		System.out.println("Área Triángulo: " + tri.CalcularArea(tri));

	}

}
