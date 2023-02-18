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
public class Alumno {
    private String nombre;
    private double nota1;
    private double nota2;

    public Alumno() {
        nombre="NN";
        nota1=05;
        nota2=05;
    }

    public Alumno(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public String promedio(){
        if(((nota1+nota2)/2)>10.5)
            return "APROBADO";
        else
            return "DESAPROBADO";
    }
    @Override
    public String toString() {
        return "Alumno" + "\nnombre=" + nombre + "\nnota1=" + nota1 + "\nnota2=" + nota2;
    }
    
}
