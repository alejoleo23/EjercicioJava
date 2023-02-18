/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo02;

import Entidades.Operacones1D;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        double x;
        x=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de x"));
        Operacones1D matematicas = new Operacones1D(x);
        JOptionPane.showMessageDialog(null,"El valor de la función es: "+matematicas.EvaluarFuncion());
    }
}
