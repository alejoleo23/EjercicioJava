/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo03;

import Entidades.VectorReales;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector"));
        VectorReales v1 = new VectorReales();
        JOptionPane.showMessageDialog(null,"Ingrese los elementos del vector");
        v1.AgregarNElementos(x);
        JOptionPane.showMessageDialog(null,"Elementos menores q el promedio son: ["+v1.MostrarMenoresPromedio()+" ]");
    }
}
