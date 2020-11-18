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
public class CuentaCorrienteACreditoGoldTest1 {
    
    private CuentaCorrienteImpl instance;
    
    public CuentaCorrienteACreditoGoldTest1() {
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
        instance = new CuentaCorrienteACreditoGold("Adrian",12000.0);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testAbona() {
        instance.abona(1000.0);
        assertEquals(11000.0, instance.getSaldo(), 0.01);

    }
    
    @Test
    public void testIngresa() {
        instance.ingresa(3000.0);
        assertEquals(15000.0, instance.getSaldo(), 0.01);        
    }
    
    @Test
    public void testErrores() {
        instance.abona(15000.0);
        assertEquals(12000.0, instance.getSaldo(), 0.01);
    }
    
    @Test
    public void testAbona2() {
        instance.abona(2000.0);
        assertNotEquals(9995.0, instance.getSaldo(), 0.01);
    }
    
    @Test
    public void testIngresa2() {
        instance.ingresa(3000.0);
        assertNotEquals(13000.0, instance.getSaldo(), 0.01);        
    }
    
    @Test
    public void testErrores2() {
        instance.abona(15000.0);
        assertNotEquals(-5000.0, instance.getSaldo(), 0.01);
    }    
    
}
