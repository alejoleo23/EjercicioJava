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
public class Ejercicio09 {
    public static void main(String[] args) {
        //c paltea
        int x,y;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector A"));
        VectorReales v1 = new VectorReales();
        v1.AgregarNElementos(x);
        VectorReales v2 = new VectorReales();
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector B"));
        v2.AgregarNElementos(y);
        VectorReales v3= new VectorReales();
        v3.Union(v1, v2);
        JOptionPane.showMessageDialog(null,"Union"+v3.MostrarElementos());
    }
}
