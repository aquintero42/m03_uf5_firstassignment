/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.entidadfinanciera;

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
public class CuentaCorrienteADebitoTest1 {
    
    private CuentaCorrienteImpl instance;
    
    public CuentaCorrienteADebitoTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciant tests");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabant tests");
    }
    
    @Before
    public void setUp() {
        instance = new CuentaCorrienteADebito("Adrian",2000.0);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testAbona() {
        instance.abona(500.0);
        assertEquals(1500.0, instance.getSaldo(), 0.01);

    }
    
    @Test
    public void testIngresa() {
        instance.ingresa(500.0);
        assertEquals(2500.0, instance.getSaldo(), 0.01);        
    }
    
    @Test(expected = AssertionError.class)
    public void testErrorAssertion() {
        instance.abona(100.0);
        assertEquals(2100.0, instance.getSaldo(), 0.01);
    }
    
    @Test
    public void testErrorAbona() {
        instance.abona(2100.0);
        assertEquals(2000.0, instance.getSaldo(), 0.01);
    }    
    
}
