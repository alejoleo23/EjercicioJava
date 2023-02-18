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
public class Ejercicio10 {
    public static void main(String[] args) {
    double x,y,z,w;
    x=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del triangulo"));
    y=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del triangulo"));
    z=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado del triangulo"));
    Triangulo triangulo = new Triangulo(x,y,z);
    w=triangulo.CalcularArea();
    if(w!=-1)
        JOptionPane.showMessageDialog(null,"El área es: "+w);
    else
        JOptionPane.showMessageDialog(null,"No es un triángulo");
    
    }
}
