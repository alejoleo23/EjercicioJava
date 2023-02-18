/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo02;

import Entidades.Numeros3;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        int a,b,c;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número"));
        Numeros3 matematicas = new Numeros3(a,b,c);
        JOptionPane.showMessageDialog(null,"El número intermedio es: "+matematicas.NumeroIntermedio());
    }
}