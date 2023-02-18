/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class VectorEnteros {
    private int vector[];
    private int numeroElementos;

    public VectorEnteros(int[] vector, int numeroElementos) {
        this.vector = vector;
        this.numeroElementos=numeroElementos;
    }
    public VectorEnteros(int n) {
        vector=new int[n];
        this.numeroElementos=n;
    }
    public VectorEnteros() {
        vector=new int[100];
        this.numeroElementos=100;
    }
    public int getNumeroElementos() {
        return numeroElementos;
    }
    public void setVector(int[] vector, int x) {
        if(numeroElementos==x){
            this.vector = vector;
        }
    }

    public void setNumeroElementos(int numeroElementos) {
        this.numeroElementos = numeroElementos;
    }
    public void AgregarElementos(){
        for(int i=0;i<numeroElementos;i++)
            vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento en la posición "+i));
    }    
    public void SumarVectores(VectorEnteros A,VectorEnteros B, int n){
        for(int i=0;i<n;i++)
            this.vector[i]=A.vector[i]+B.vector[i];
    }
    public String MostrarElementos(){
        String f="[";
        for(int i=0;i<numeroElementos;i++){
            if(i!=numeroElementos-1)
                f=f+vector[i]+", ";
            else
                f=f+vector[i]+"]";
        }
        return f;
    }
}
