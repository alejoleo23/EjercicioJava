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
public class Mat2 {
    private int x;
    private int y;

    public Mat2() {
        this.x = 0;
        this.y = 1;
    }

    public Mat2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public String Divisible()
    {
        if(y!=0)
            if(x%y==0 )
                return (x+" es divisible por "+y);
            else
                return (x+" no es divisible por "+y);
        else
            return ("ERROR, no se puede dividir por cero");
    }

    @Override
    public String toString() {
        return "Numeros: " + "x=" + x + ", y=" + y;
    }
    
}
