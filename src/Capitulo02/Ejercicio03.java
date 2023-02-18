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
public class Ejercicio03 {
    public static void main(String[] args) {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital"));
        Operacones1D matematicas = new Operacones1D(a);
        JOptionPane.showMessageDialog(null,"El interés es: "+matematicas.InteresMensual());
    }
}
