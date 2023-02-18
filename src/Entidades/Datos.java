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
public class Datos {
    private double dato[];
    private double peso[];
    private int totalElementos;

    public Datos() {
        dato=new double[10];
        peso=new double[10];
        totalElementos=0;
    }

    public Datos(double[] dato, double[] peso, int totalElementos) {
        this.dato = dato;
        this.peso = peso;
        this.totalElementos = totalElementos;
    }

    public double[] getDato() {
        return dato;
    }

    public double[] getPeso() {
        return peso;
    }

    public int getTotalElementos() {
        return totalElementos;
    }

    public void setDato(double[] dato) {
        this.dato = dato;
    }

    public void setPeso(double[] peso) {
        this.peso = peso;
    }

    public void setTotalElementos(int totalElementos) {
        this.totalElementos = totalElementos;
    }
    public void AgregarNElementos(int n){
        for(int i=0;i<n;i++){
            dato[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dato de la posición "+i));
            peso[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la posición "+i));
        }
        this.totalElementos=n;
    }
    public double Ponderado(){
        if(totalElementos>0){
            double s1=0,s2=0;
            for(int i=0;i<totalElementos;i++){
                s1=s1+dato[i]*peso[i];
                s2=s2+peso[i];
            }
            return s1/s2;
        }
        else
            return -1;
        
    }
}
