/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.print.DocFlavor;

/**
 *
 * @author yojar
 */
public class Ccomplejo {
    
    private double numreal;
    private double numimag;
  
    //Constructor por defecto de la clase
    public Ccomplejo() {
   
    }
    //Constructor con parámetros

    public Ccomplejo(double numreal, double numimag) {
        this.numreal = numreal;
        this.numimag = numimag;
    }

    public double getNumreal() {
        return numreal;
    }

    public void setNumreal(double numreal) {
        this.numreal = numreal;
    }

    public double getNumimag() {
        return numimag;
    }

    public void setNumimag(double numimag) {
        this.numimag = numimag;
    }
  

   
   
    //sumar dos números complejos
    //(a, b) + (c, d) = (a + c, b + d);
    public Ccomplejo sumar(Ccomplejo c){
        Ccomplejo aux = new Ccomplejo();
        aux.numreal = numreal + c.numreal;
        aux.numimag = numimag + c.numimag;
        return aux;
    }
   
    //restar dos números complejos
    //(a, b) - (c, d) = (a - c, b - d);
    public Ccomplejo restar(Ccomplejo c){
        Ccomplejo aux = new Ccomplejo();
        aux.numreal = numreal - c.numreal;
        aux.numimag = numimag - c.numimag;
        return aux;
    }
   
    //multiplicar dos números complejos
    //(a, b) * (c, d) = (a*c – b*d, a*d + b*c)
    public Ccomplejo multiplicar(Ccomplejo c){
        Ccomplejo aux = new Ccomplejo();
        aux.numreal = numreal * c.numreal - numimag * c.numimag;
        aux.numimag = numreal * c.numimag + numimag * c.numreal;
        return aux;
    }
   
    //multiplicar un número complejo por un número de tipo double
    //(a, b) * n = (a * n, b * n)
    public Ccomplejo multiplicar(double n){
        Ccomplejo aux = new Ccomplejo();
        aux.numreal = numreal * n;
        aux.numimag = numimag * n;
        return aux;
    }
   
    //dividir dos números complejos
    //(a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
    public Ccomplejo dividir(Ccomplejo c){
        Ccomplejo aux = new Ccomplejo();
        aux.numreal = (numreal * c.numreal + numimag * c.numimag)/(c.numreal * c.numreal + c.numimag * c.numimag);
        aux.numimag = (numimag * c.numreal - numreal * c.numimag)/(c.numreal * c.numreal + c.numimag * c.numimag);
        return aux;
    }

    //método toString
    @Override
    public String toString() {
        return "(" + numreal + ", " + numimag + ")";
    }

    //método equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ccomplejo other = (Ccomplejo) obj;
        if (this.numreal != other.numreal) {
            return false;
        }
        if (this.numimag != other.numimag) {
            return false;
        }
        return true;
    } 
    
}
