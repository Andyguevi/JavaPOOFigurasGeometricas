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
public class Rombo {
    private double Base;
    private double Altura;

    /**
     * Método constructor, crea el Rectangulo con las propiedades Base y Altura
     * @param base Valor tipo double
     * @param altura Valor tipo double
     */
    public Rombo (double base, double altura) {
        this.Base = base;
        this.Altura = altura;
    }
    
    /**
     * Método constructor, crea el Rectangulo con valores por defecto
     */
    public Rombo() {
        // Llama al método constructor anterior
        this(0, 0);
    }

    /**
     * Método que retorna el valor de la Base 
     * @return Retorna el valor de la Base en tipo double
     */
    public double getBase() {
        return Base;
    }

    /**
     * Método que modifica el valor de la Base
     * @param base Valor de tipo double
     */
    public void setBase(double base) {
        this.Base = base;
    }

    /**
     * Método que retorna el valor de la Altura 
     * @return Retorna el valor de la Altura en tipo double
     */
    public double getAltura() {
        return Altura;
    }

    /**
     * Método que modifica el valor de la Altura
     * @param altura Valor de tipo double
     */
    public void setAltura(double altura) {
        this.Altura = altura;
    }
    
    /**
     * Método que retorna el area del Rectangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return this.Base * this.Altura;
    }
    
    /**
     * Método que retorna el perimetro del Rectangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (2 * (this.Base + this.Altura));
    }
    
}
