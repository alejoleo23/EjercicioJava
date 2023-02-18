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
public class Ejercicio06 {
    public static void main(String[] args) {
        int x,y;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector A"));
        VectorReales v1 = new VectorReales();
        v1.AgregarNElementos(x);
        VectorReales v2 = new VectorReales();
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del vector B"));
        v2.AgregarNElementos(y);
        if(v1.SonIguales(v2)==true)
            JOptionPane.showMessageDialog(null,"Los vectores son iguales");
        else
            JOptionPane.showMessageDialog(null,"Los vectores NO son iguales");
    }
}
