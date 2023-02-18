/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Luis
 */
public class Trabajador {
    private String nombre;
    private int horas;
    private double preciohora;

    public Trabajador(String nombre, int horas, double preciohora) {
        this.nombre = nombre;
        this.horas = horas;
        this.preciohora = preciohora;
    }

    public Trabajador() {
        nombre="NN";
        horas=0;
        preciohora=0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public double getPreciohora() {
        return preciohora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setPreciohora(double preciohora) {
        this.preciohora = preciohora;
    }
    public String PagoTrabajador(){
        double s,s2,i,sn=0;
        if(horas<=140 && horas>0)
	{
		s=horas*preciohora;
		i=0;
	}
	else
		if(horas>140){
			s2=(horas-140)*preciohora*1.5;
                        s=(140*preciohora)+s2;
			}
		else
			return "Ingrese numero valido";
	if(s<=200)
		i=0;
		else
		{
			i=0.15*s;
			sn=s-i;
		}
        return ("El sueldo neto es: "+sn+". \n El interés es: "+i);
    }
    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", horas=" + horas + ", preciohora=" + preciohora + '}';
    }
    
}
