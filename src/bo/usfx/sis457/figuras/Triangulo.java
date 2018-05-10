/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author WIN 10
 */
public class Triangulo {
    private double Base;
    private double Altura;

    public Triangulo (double Base, double Altura) {

        this.Base = Base;
        this.Altura = Altura;
    }
    public Triangulo (){
        this (0, 0);
    }
    public double getBase (){
        return Base;
        
    }
    public void setBase(double Base){
        this.Base = Base;
    }
    
    public double getAltura(){
        return Altura;
    }
    public void setAltura(){
        this.Altura= Altura;
     
    }
    public double getArea() {
        return (this.Base * this.Altura) / 2;
    }
    
}