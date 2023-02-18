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
public class Operacones1D {
    private double a;

    public Operacones1D() {
        this.a = 0;
    }

    public Operacones1D(double a) {
        this.a = a;
    }

    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getA() {
        return a;
    } 
    
    public double InteresMensual(){
        double t;
        if (a<500)
		t=a*0.02;
	else
		if(a<1500)
			t=a*0.045;
		else
			t=a*0.09;
	return t*a;
    }

    public double EvaluarFuncion(){
        if (a<0)
		return (Math.pow(a,3)+(a/2));
	else
		return (4*Math.pow(a,2)-2);
    }

    @Override
    public String toString() {
        return "Numero: " + "a=" + a;
    }
    
   
}
