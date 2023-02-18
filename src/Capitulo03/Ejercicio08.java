/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo03;

import Entidades.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        int x,y;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector A"));
        Datos d = new Datos();
        d.AgregarNElementos(x);
        JOptionPane.showMessageDialog(null,"El promedio ponderado es: "+d.Ponderado());
    }
}
