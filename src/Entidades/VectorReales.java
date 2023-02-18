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
public class VectorReales {
    private double vector[];
    private int totalElementos;

    public VectorReales(double[] vector, int totalElementos) {
        this.vector = vector;
        this.totalElementos = totalElementos;
    }

    public VectorReales() {
        vector=new double[10];
        totalElementos=0;
    }

    public double[] getVector() {
        return vector;
    }

    public double getTotalElementos() {
        return totalElementos;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public void setTotalElementos(int totalElementos) {
        this.totalElementos = totalElementos;
    }
    public void AgregarNElementos(int n){
        for(int i=0;i<n;i++){
            vector[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el elemento en la posición "+i));
        }
        this.totalElementos=n;
    }
    public String MostrarElementos(){
        String res="";
        for(int i=0;i<totalElementos;i++){
            res=res+vector[i]+", ";
        }
        return res;
    }
    public double PromedioVector(){
        double s=0;
        for(int i=0;i<totalElementos;i++){
            s=s+vector[i];
        }
        return s/totalElementos;
    }
    public String MostrarMenoresPromedio(){
        double men=PromedioVector();
        String res="";
        for(int i=0;i<totalElementos;i++){
            if(vector[i]<men)
                res=res+vector[i]+", ";
        }
        return res;
    }
    public String NoSeEncuentran(VectorReales y){
        String res="";
        for(int i=0;i<=totalElementos;i++){
            if(ContarRep(y.vector[i])==0)
                res=res+this.vector[i]+", ";
        }
        return res;
    }
    public int ContarRep(double x){
        int c=0;
        for(int i=0;i<=totalElementos;i++){
            if(x==vector[i])
                c++;
        }
        return c;
    }
    public double PorcentajeMayor(){
        int ap=0;
        for(int i=0;i<totalElementos;i++){
            if(this.vector[i]>=10.5)
                ap++;
        }
        return ap*100f/totalElementos;
    }
    public boolean SonIguales(VectorReales y){
        if(totalElementos==y.totalElementos){
            for(int i=0;i<totalElementos;i++){
                if(this.vector[i]!=y.vector[i])
                    return false;
            }
        }
        else
            return false;
        return true;
    }
    public void ordenar(){
        double aux;
        for(int i=0;i<totalElementos;i++){
            for(int j=i+1;j<totalElementos;j++){
                if(vector[i]>vector[j]){
                   aux=vector[i];
                   vector[i]=vector[j];
                   vector[j]=aux;
                }
        }
        }
    }
    public double Mediana(){
        ordenar();
        if(totalElementos%2==0)
            return (vector[totalElementos/2]+vector[(totalElementos/2)-1])/2;
        else
            return vector[totalElementos/2];
    }
    public void eliminarRep(){
        int z=0;
        double aux[]=new double[totalElementos];
        for(int i=0;i<totalElementos;i++){
            for(int j=0;j<totalElementos-1;j++){
                if(i!=j){
                    if(vector[i]==vector[j])
                        vector[j]=-99.99;
                }
            }
        }
        for(int i=0;i<totalElementos;i++){
            if(vector[i]!=-99.99){
               aux[z]=vector[i];
               z++;
            }
        }
        System.arraycopy(aux, 0, vector, 0, z);
        totalElementos=z;
    }
    public void Union(VectorReales x,VectorReales y){
        x.ordenar();
        y.ordenar();
        int i=0,j=0,p=0;
        while(i<x.totalElementos && j<y.totalElementos){
            if(x.vector[i]<=y.vector[j]){
                this.vector[p]=x.vector[i];
                i++;
            }
            else{
                this.vector[p]=y.vector[j];
                j++;
            }
            p++;
        }
        while(i<=x.totalElementos){
            this.vector[p]=x.vector[i];
            i++;
            p++;
        }
        while(j<=y.totalElementos){
            this.vector[p]=y.vector[j];
            j++;
            p++;
        }
        totalElementos=p-1;
        eliminarRep();
    }
    public double Armonica(){
        double s=0;
        for(int i=0;i<totalElementos;i++){
            s=s+(1/vector[i]);
        }
        return totalElementos/s;
    }
}