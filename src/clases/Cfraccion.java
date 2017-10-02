/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author yojar
 * 
 */
public class Cfraccion {
     
    private int num;
    private int den;

    public Cfraccion() {
        this.num = 0;
        this.den = 1;
    }

    public Cfraccion(int num, int den) {
        this.num = num;
        if(den==0){
            den = 1;
        }
        this.den = den;
        simplificar();
    }

    public Cfraccion(int num) {
        this.num = num;
        this.den = 1;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //sumar fracciones
    public Cfraccion sumar(Cfraccion f) {
        Cfraccion aux = new Cfraccion();
        aux.num = this.num * f.den + this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //restar fracciones
    public Cfraccion restar(Cfraccion f) {
        Cfraccion aux = new Cfraccion();
        aux.num = this.num * f.den - this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //multiplicar fracciones
    public Cfraccion multiplicar(Cfraccion f) {
        Cfraccion aux = new Cfraccion();
        aux.num = this.num * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }

    //dividir fracciones
    public Cfraccion dividir(Cfraccion f) {
        Cfraccion aux = new Cfraccion();
        aux.num = this.num * f.den;
        aux.den = this.den * f.num;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
    }
   
    //Cálculo del máximo común divisor por el algoritmo de Euclides
    private int mcd() {
        int u = Math.abs(num); //valor absoluto del numerador
        int v = Math.abs(den); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    //método para simplificar fracciones
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        num = num / n;
        den = den / n;
    }

    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }    
}
