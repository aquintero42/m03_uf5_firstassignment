/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.regexpr.calc;

/**
 *
 * @author Adrian
 */


public class CalculadoraDeFracciones {
    
    private Fraccion operador1;
    
    private Fraccion operador2;

    public CalculadoraDeFracciones(Fraccion operador1, Fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
    /**
     * a/b + c/d = ((ad) + (bc))/ (bd)
     * @return 
     */
    public Fraccion suma() {
        return new Fraccion(operador1.getNumerador()*operador2.getDenominador() + operador1.getDenominador()*operador2.getNumerador(),
        operador1.getDenominador()*operador2.getDenominador());
    }
    
    /**
     * a/b + c/d = ((ad) - (bc))/ (bd)
     * @return 
     */    
    public Fraccion resta() {
        return new Fraccion(operador1.getNumerador()*operador2.getDenominador() - operador1.getDenominador()*operador2.getNumerador(),
        operador1.getDenominador()*operador2.getDenominador());
    }
    
    /** 
     * Producto de dos fracciones operador1 * operador2 
     * a/b * c/d = a*c / b*d
     */
    public Fraccion producto() {
        Fraccion producto = new Fraccion(operador1.getNumerador()*operador2.getNumerador() , operador1.getDenominador()*operador2.getDenominador());
        return simplify(producto);
    }
    
    
    /* Division de dos fracciones operador1 / operador2 */
    public Fraccion division() {
        Fraccion division = new Fraccion(operador1.getNumerador()*operador2.getDenominador() , operador1.getDenominador()*operador2.getNumerador());
        return simplify(division);
    }
    
    /**
     * Maximo comun divisor, el numero más grande que divide dos numeros
     * Fraccion (12,9)  -> Fraccion(4,3)
     */
    private double mcd(double d1, double d2) {
        if (d2 == 0) {
            return d1;
        } else {
            return mcd(d2,d1%d2);
        }

    }
    
    private Fraccion simplify(Fraccion fraccion) {
        double mcd = mcd(fraccion.getNumerador(), fraccion.getDenominador());
        return new Fraccion(fraccion.getNumerador()/mcd, fraccion.getDenominador()/mcd);
    }
    
}
