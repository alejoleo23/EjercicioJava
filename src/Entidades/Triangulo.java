/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Luis
 */
public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangulo() {
        a=10;
        b=10;
        c=10;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double CalcularArea(){
        double s,A;
        s=(a+b+c)/2;
	if (s>a && s>b && s>c)
		{
		A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
	else
		A=-1;
        return A;
    }
    public String ClasificarTriangulo(){
        String t;
        if (a>0 && b>0 && c>0)
		if (a+b>c && a+c>b && b+c>a)
		{
			if (a==b && b==c)
				t="equilatero";
			else
				if (a==b || c==a || b==c)
					t="isóceles";
				else 
					t="escaleno";
                        return t;
		}
		else
			return "No es un triangulo";
	else
		return "Datos incorrectos";
    }
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}
