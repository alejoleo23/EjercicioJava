/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo02;

import Entidades.Triangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        double x,y,z;
        x=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del triángulo"));
        y=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del triángulo"));
        z=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado del triángulo"));
        Triangulo matematicas = new Triangulo(x,y,z);
        JOptionPane.showMessageDialog(null,"Estos lados conforman un triangulo: "+matematicas.ClasificarTriangulo());
    }
}
