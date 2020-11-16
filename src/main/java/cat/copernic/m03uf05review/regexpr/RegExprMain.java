/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Adrian 
 * 
 */

public class RegExprMain {

    /**
     * Expresión regular que valide un NIF
     */
    public static boolean validateNif(String nif) {
        Pattern p = Pattern.compile("(\\d{8})([B-DF-HJ-NP-TV-Z])");
        //Pattern p = Pattern.compile("^(\\d{8})$([^AEIOU])");
        Matcher m1 = p.matcher(nif);
        return m1.matches();
    }    
    
    /**
     * Expresión regular que valide un NIE
     */
    public static boolean validateNie(String nie) {
        Pattern p = Pattern.compile("[XYZ]\\d{7}[-]\\p{Lu}");
        Matcher m1 = p.matcher(nie);
        return m1.matches();
    }    
    
    /**
     * Expresión regular que valide un teléfono móvil
     */
    public static boolean validateMovil(String telM) {
        Pattern p = Pattern.compile("[6]\\d{8}");
        Matcher m1 = p.matcher(telM);
        return m1.matches();
    }    
    
    /**
     * Expresión regular que valide un teléfono de España
     */
    public static boolean validateTelEsp(String telEsp) {
        Pattern p = Pattern.compile("[+]34\\p{Blank}93\\d{7}");
        Matcher m1 = p.matcher(telEsp);
        return m1.matches();
    }    
    
    /**
     * Expresión regular que valide una matricula (cuatro digitos tres letras mayúsculas que no sean vocales)
     */
    public static boolean validateMatricula(String matricula) {
        Pattern p = Pattern.compile("(\\d{4})(\\p{Blank})([B-DF-HJ-NP-TV-Z]{3})");
        Matcher m1 = p.matcher(matricula);
        return m1.matches();
    } 
    
    /**
     * Expresión regular que valide una fecha formato dd/mm/aaaa
     */
    public static boolean validateFecha(String fecha) {
        Pattern p = Pattern.compile("(0[1-9]||1[0-9]||2[0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-2][0-9][0-9][0-9])");
        Matcher m1 = p.matcher(fecha);
        return m1.matches();
    }
    
    /**
     * Expresión regular que valide un email
     */
    public static boolean validateEmail(String email) {
        //Pattern p = Pattern.compile("[a-zA-Z0-9.]*@[a-zA-Z]+(.[a-zA-Z]+)");
        Pattern p = Pattern.compile("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        Matcher m1 = p.matcher(email);
        return m1.matches();
    }     
    
    /**
     * Expresión regular que valide una clave en la forma AA999AA donde
     * la segunda AA es igual a la primera
     */
    public static boolean validateClave(String clave) {
        Pattern p = Pattern.compile("^((\\p{Alpha}\\p{Alpha})(\\d{3}))\\2$");
        Matcher m1 = p.matcher(clave);
        return m1.matches();
    }
    
    
    public static void main(String[] args) {
        /*Pattern p = Pattern.compile("(\\p{Lower}|\\p{Digit})+");
        Matcher m1 = p.matcher("a9");
        Matcher m2 = p.matcher("ab8");
        boolean b1 = m1.matches();
        boolean b2 = m2.matches();
        System.out.println(b1);
        System.out.println(b2);*/
        boolean bNif = validateNif("46386152M");
        System.out.println("NIF = " + bNif);
        
        boolean bNie = validateNie("Y1234567-Z");
        System.out.println("NIE = " + bNie);
        
        boolean bMovil = validateMovil("637636949");
        System.out.println("Telefono movil = " + bMovil);
        
        boolean bTelEsp = validateTelEsp("+34 937892982");
        System.out.println("Telefono Esp = " + bTelEsp);
        
        boolean bMatricula = validateMatricula("1234 DFG");
        System.out.println("Matricula = " + bMatricula);
        
        boolean bFecha = validateFecha("31/12/2999");
        System.out.println("Fecha = " + bFecha);
        
        boolean bEmail = validateEmail("adri.bcn.98@gmail.com");
        System.out.println("Email = " + bEmail);
        
        boolean bClave = validateClave("AA999AA");
        System.out.println("Clave = " + bClave);
    }
    
}
