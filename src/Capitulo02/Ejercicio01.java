/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo02;
import Entidades.Mat2;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número mayor"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número menor"));
        Mat2 matematicas = new Mat2(a,b);
        JOptionPane.showMessageDialog(null,matematicas.Divisible());
    }
}
