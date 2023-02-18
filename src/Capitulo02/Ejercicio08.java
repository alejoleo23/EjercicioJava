/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo02;

import Entidades.Trabajador;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        int h;
        double ph;
        String nombre;
        nombre=JOptionPane.showInputDialog("Ingrese el nombre del trabajador");
        h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en horas"));
        ph=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago por hora"));
        Trabajador trabajador = new Trabajador(nombre,h,ph);
        JOptionPane.showMessageDialog(null,"El pago es "+trabajador.PagoTrabajador());
    }
}
