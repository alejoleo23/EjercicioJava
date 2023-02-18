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
public class Ejercicio04 {
    public static void main(String[] args) {
        int x,y;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de notas"));
        VectorReales notas = new VectorReales();
        notas.AgregarNElementos(x);
        JOptionPane.showMessageDialog(null,"El porcentaje de aprobados es: ["+notas.PorcentajeMayor()+" ]");
        JOptionPane.showMessageDialog(null,"El porcentaje de desaprobados es: ["+(100-notas.PorcentajeMayor())+" ]");
    }
}
