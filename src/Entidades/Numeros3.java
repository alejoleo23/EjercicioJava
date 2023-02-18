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
public class Numeros3 {
    private int A;
    private int B;
    private int C;

    public Numeros3() {
        this.A = 0;
        this.B = 0;
        this.C = 0;
    }

    public Numeros3(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public int NumeroIntermedio(){
        int i;
        if (A>B) 
		if (C>A)
			i=A;
		else /*"C seria menor que A"*/
			if (B>C)
				i=B;
			else
				i=C;
	else /*"B seria mayor que A"*/
		if(C>A)
			if (B>C)
				i=C;
			else /*"B seria menor que C"*/
				i=B;
		else /*B es menor que C"*/
			i=A;
        return i;
    }
}
