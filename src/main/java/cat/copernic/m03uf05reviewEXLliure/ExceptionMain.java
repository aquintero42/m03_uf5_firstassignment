/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05reviewEXLliure;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian
 */
public class ExceptionMain {
    
    static double multiplicacion(double a, double b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("No puedes añadir numeros negativos", new IllegalArgumentException());
        }
        return a * b;
    }
    
    static String texto(String c) throws Exception {
        if (c == "") {
            throw new Exception("String vacio", new IllegalArgumentException());
        }
        return c;
    }
    
    static String letraD(String d) throws Exception {
        if (d != "D" || d != "d") {
            throw new Exception("Letra incorrecta" , new IllegalArgumentException());
        }
        return d;
    }
    
    public static void main(String[] args) {
        double m = 0;
        String s = "";
        String l = "";
        try {
            m = multiplicacion(2.5, 3.7);
            s = texto("hola");
            l = letraD("d");
        } catch (IllegalArgumentException | IOException ex) {
            Logger.getLogger(cat.copernic.m03uf05review.exceptions.ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(m);
        System.out.println(s);
        System.out.println(l);
    }
    
}
