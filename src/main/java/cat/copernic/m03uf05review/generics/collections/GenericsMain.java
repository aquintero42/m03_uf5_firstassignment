/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class GenericsMain {

    /**
     * Escribe un método que retorne el último elemento de una lista
    */
    public static <T> T ultimo(List<T> lista1) {
        if (!lista1.isEmpty()) {
            return lista1.get(lista1.size()-1);
        }
        return (T) lista1;
    }
    
    
    /**
     * Escribe un método que retorne la media de una lista de Double
     */
    public static double media(List<Double> lista2) {
        double media = 0;
        
        for (int i = 0; i < lista2.size() ; i++) {
            media += lista2.get(i);
        }
        return media / lista2.size();
    }

    
    /**
     * Escribe un método que retorne la cadena más larga de una lista de cadenas
     */    
    public static String cadenaLarga(List<String> lista1) {
        String largo = lista1.get(0);
        
        for (int i = 0 ; i < lista1.size() ; i++) {
            
            if( lista1.get(i).length() > largo.length() ) {
                largo = lista1.get(i);
            }

        }
        return largo;
    }
    
    
    /**
     * Escribe un método que retorne el máximo de una lista de enteros
     */    
    public static int maximoEntero(List<Integer> lista3) {
        int maximo = 0;
        
        for (int i=0 ; i < lista3.size() ; i++) {
            
            if ( lista3.get(i) > maximo ) {
                maximo = lista3.get(i);
            }
        }
        
        return maximo;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista1 = new LinkedList<>();
        List<Double> lista2 = new LinkedList<>();
        List<Integer> lista3 = new LinkedList<>();
        
        lista1.add("Marta");
        lista1.add("Eva");
        lista1.add("Joan");
        lista1.add("Carles");
        lista1.add("Pep");
        
        lista2.add(5.0);
        lista2.add(2.5);
        lista2.add(7.5);
        
        lista3.add(4);
        lista3.add(2);
        lista3.add(8);
        
        /*if (lista1.isEmpty()) {
            System.out.println("Lista es buida");
        } else {
            System.out.println("Lista te " + lista1.size() + " elements.");
        }*/
        
        //lista1.remove("Carles");
        
        /*for (int i = 0 ; i < lista1.size() ; i++) {
            System.out.println(lista1.get(i));
        }*/
        
        /*for (Iterator<String> it = lista1.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }*/
        
        //List<String> l2 = lista1.subList(0, lista1.size()/2);
        
        System.out.println(ultimo(lista1));
        System.out.println(media(lista2));        
        System.out.println(cadenaLarga(lista1));
        System.out.println(maximoEntero(lista3));

        
    }
    
}
