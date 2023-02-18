/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo03;

import Entidades.VectorEnteros;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int x=0;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos de los vectores"));
        VectorEnteros v1 = new VectorEnteros(x);
        VectorEnteros v2 = new VectorEnteros(x);
        VectorEnteros v3 = new VectorEnteros(x);
        JOptionPane.showMessageDialog(null,"Primer Vector");
        v1.AgregarElementos();
        JOptionPane.showMessageDialog(null,"Segundo Vector");
        v2.AgregarElementos();
        v3.SumarVectores(v1, v2, x);
        JOptionPane.showMessageDialog(null,"Elementos del vector Suma: "+v3.MostrarElementos());
    }
}
