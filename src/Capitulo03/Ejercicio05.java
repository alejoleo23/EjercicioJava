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
public class Ejercicio05 {
    public static void main(String[] args) {
        int x;
        double e;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos"));
        VectorReales v = new VectorReales();
        v.AgregarNElementos(x);
        e=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el elemento a buscar"));
        JOptionPane.showMessageDialog(null,"Las veces que se repite el numero "+e+" son: "+v.ContarRep(e));
    }
}
