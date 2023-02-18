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
public class Ejercicio07 {
    public static void main(String[] args) {
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector"));
        VectorReales v1 = new VectorReales();
        v1.AgregarNElementos(x);
        JOptionPane.showMessageDialog(null,"La mediana es"+v1.Mediana());
    }
}
