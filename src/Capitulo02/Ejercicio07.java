/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo02;

import Entidades.Operaciones1;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de boleto"));
        Operaciones1 matematicas = new Operaciones1(x);
        JOptionPane.showMessageDialog(null,"Se ubica en "+matematicas.NumerodeBoleto());
    }
}
