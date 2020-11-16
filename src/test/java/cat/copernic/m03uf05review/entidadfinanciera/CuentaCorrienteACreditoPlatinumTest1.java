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
public class CuentaCorrienteACreditoPlatinumTest1 {
    
    private CuentaCorrienteImpl instance;
    
    public CuentaCorrienteACreditoPlatinumTest1() {
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
        instance = new CuentaCorrienteACreditoGold("Adrian",10000.0);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testAbona() {
        instance.abona(1000.0);
        assertEquals(9000.0, instance.getSaldo(), 0.01);

    }
    
    @Test
    public void testIngresa() {
        instance.ingresa(3000.0);
        assertEquals(13000.0, instance.getSaldo(), 0.01);        
    }
    
    @Test
    public void testErrores() {
        instance.abona(15000.0);
        assertEquals(10000.0, instance.getSaldo(), 0.01);
    }
    
}
