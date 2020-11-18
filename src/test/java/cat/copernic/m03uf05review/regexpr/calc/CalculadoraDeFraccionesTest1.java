/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.regexpr.calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class CalculadoraDeFraccionesTest1 {
    
    private CalculadoraDeFracciones instance;
    
    public CalculadoraDeFraccionesTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando tests...");
    }
    
    @Before
    public void setUp() {
        Fraccion f1 = new Fraccion(2,3);
        Fraccion f2 = new Fraccion(2.0,3.0);
        instance = new CalculadoraDeFracciones(f1,f2);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testSuma() {
        assertEquals(new Fraccion(12.0,9.0), instance.suma());
        assertEquals(12.0, instance.suma().getNumerador(), 0.001);
        assertEquals(9.0, instance.suma().getDenominador(), 1.0E-3); // 1.0 ^ -3 -> 1 / 1000
    }

    @Test
    public void testResta() {
        assertEquals(new Fraccion(0.0,9.0), instance.resta());
        assertEquals(0.0, instance.resta().getNumerador(), 0.001);
        assertEquals(9.0, instance.resta().getDenominador(), 1.0E-3);
    }
    
    @Test
    public void testProducto() {
        assertEquals(new Fraccion(4.0,9.0), instance.producto());
        assertEquals(4.0, instance.producto().getNumerador(), 0.001);
        assertEquals(9.0, instance.producto().getDenominador(), 1.0E-3);
    }    
    
    @Test
    public void testDivision() {
        assertEquals(new Fraccion(1.0,1.0), instance.division());
        assertEquals(1.0, instance.division().getNumerador(), 0.001);
        assertEquals(1.0, instance.division().getDenominador(), 1.0E-3);
    }      
    
}
