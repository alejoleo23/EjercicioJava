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
public class Operaciones1 {
    
    private int b;

    public Operaciones1() {
        b=0;
    }

    public Operaciones1(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public String NumerodeBoleto(){
        int f,c;
        if(b%500==0){
		f=b/500;
		c=500;}
	else{
		f=(b/500)+1;
		c=b%500;
	}
        return ("Fila: "+f+"Columna: "+c);
    }
    public String DigitosPares(){
        while(b!=0)
        {
            if(b%10%2!=0)
                return " NO cumple la condición";
            b=b/10;
        }
        return " cumple la condición";
    }

    @Override
    public String toString() {
        return "Numero: " + "b=" + b;
    }
    
}

