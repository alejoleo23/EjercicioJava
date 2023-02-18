/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo02;

import Entidades.Alumno;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        int a,b;
        String nombre;
        nombre=JOptionPane.showInputDialog("Ingrese nombre del alumno");
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 01"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 02"));
        Alumno alumno = new Alumno(nombre,a,b);
        JOptionPane.showMessageDialog(null,"El alumno está "+alumno.promedio());
    }
}
