/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.regexpr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Adrian
 */
public class RegExprMainTest1 {
    
    public RegExprMainTest1() {
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
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testValidateNif() {
        assertTrue(RegExprMain.validateNif("46386152M"));
        assertTrue(RegExprMain.validateNif("65004020V"));
        assertTrue(RegExprMain.validateNif("46386152H"));
        assertTrue(RegExprMain.validateNif("46386152M"));
        assertTrue(RegExprMain.validateNif("46386152M"));
        assertFalse(RegExprMain.validateNif("ABCDEFGH1"));
        assertFalse(RegExprMain.validateNif("FKEJA2342432"));
        assertFalse(RegExprMain.validateNif("DNI"));
        assertFalse(RegExprMain.validateNif("12345ABCD"));
        assertFalse(RegExprMain.validateNif("LOREMIPSUM"));
    }
    
    /*@ParameterizedTest
    @ValueSource(strings = {"46386152M, 46386152H"})
    public void testValidateNifTrue(String nif) {
        assertTrue(RegExprMain.validateNif(nif));
    }*/
    
    @Test
    public void testValidateNie() {
        assertTrue(RegExprMain.validateNie("X1234567-A"));
        assertTrue(RegExprMain.validateNie("Y1234567-B"));
        assertTrue(RegExprMain.validateNie("Z1234567-C"));
        assertTrue(RegExprMain.validateNie("Z4328592-D"));
        assertTrue(RegExprMain.validateNie("Z5319894-E"));
        assertFalse(RegExprMain.validateNie("E-4357312-Z"));
        assertFalse(RegExprMain.validateNie("E-8651925-Z"));
        assertFalse(RegExprMain.validateNie("46386152M"));
        assertFalse(RegExprMain.validateNie("NIE"));
        assertFalse(RegExprMain.validateNie("Test"));
    }

    @Test
    public void testValidateMovil() {
        assertTrue(RegExprMain.validateMovil("637636949"));
        assertTrue(RegExprMain.validateMovil("612185132"));
        assertTrue(RegExprMain.validateMovil("645543249"));
        assertTrue(RegExprMain.validateMovil("662378532"));
        assertTrue(RegExprMain.validateMovil("685839182"));
        assertFalse(RegExprMain.validateMovil("937892982"));
        assertFalse(RegExprMain.validateMovil("63763694926"));
        assertFalse(RegExprMain.validateMovil("AEIOU"));
        assertFalse(RegExprMain.validateMovil("513895150135"));
        assertFalse(RegExprMain.validateMovil("Movil"));
    }

    @Test
    public void testValidateTelEsp() {
        assertTrue(RegExprMain.validateTelEsp("+34 937892982"));
        assertTrue(RegExprMain.validateTelEsp("+34 936321574"));
        assertTrue(RegExprMain.validateTelEsp("+34 935832943"));
        assertTrue(RegExprMain.validateTelEsp("+34 935895489"));
        assertTrue(RegExprMain.validateTelEsp("+34 937432874"));
        assertFalse(RegExprMain.validateTelEsp("+35 937892982"));
        assertFalse(RegExprMain.validateTelEsp("+34 927892982"));
        assertFalse(RegExprMain.validateTelEsp("+34 93789298255"));
        assertFalse(RegExprMain.validateTelEsp("+81 987892982"));
        assertFalse(RegExprMain.validateTelEsp("Telefono España"));
    }

    @Test
    public void testValidateMatricula() {
        assertTrue(RegExprMain.validateMatricula("1234 BCD"));
        assertTrue(RegExprMain.validateMatricula("5678 FGH"));
        assertTrue(RegExprMain.validateMatricula("9012 KKL"));
        assertTrue(RegExprMain.validateMatricula("3456 MNP"));
        assertTrue(RegExprMain.validateMatricula("7890 QRS"));
        assertFalse(RegExprMain.validateMatricula("1234 ABC"));
        assertFalse(RegExprMain.validateMatricula("1234 EDF"));
        assertFalse(RegExprMain.validateMatricula("1234 IGH"));
        assertFalse(RegExprMain.validateMatricula("1234 OIJ"));
        assertFalse(RegExprMain.validateMatricula("1234 UKL"));
    }

    @Test
    public void testValidateFecha() {
        assertTrue(RegExprMain.validateFecha("15/09/1998"));
        assertTrue(RegExprMain.validateFecha("20/02/1492"));
        assertTrue(RegExprMain.validateFecha("08/06/2002"));
        assertTrue(RegExprMain.validateFecha("31/12/2008"));
        assertTrue(RegExprMain.validateFecha("14/03/2020"));
        assertFalse(RegExprMain.validateFecha("20/14/2021"));
        assertFalse(RegExprMain.validateFecha("35/07/1996"));
        assertFalse(RegExprMain.validateFecha("31/12/4500"));
        assertFalse(RegExprMain.validateFecha("31/12/5000"));
        assertFalse(RegExprMain.validateFecha("55/55/5550"));
    }

    @Test
    public void testValidateEmail() {
        assertTrue(RegExprMain.validateEmail("adri.bcn.98@gmail.com"));
        assertTrue(RegExprMain.validateEmail("quintero.gimenez.adrian@alumnat.copernic.cat"));
        assertTrue(RegExprMain.validateEmail("pep.mendez@copernic.cat"));
        assertTrue(RegExprMain.validateEmail("a.q.g.bcn.98@gmail.com"));
        assertTrue(RegExprMain.validateEmail("adrian_bcn_96@hotmail.com"));
        assertFalse(RegExprMain.validateEmail("adri@.com"));
        assertFalse(RegExprMain.validateEmail("quintero.gimenez@gmail"));
        assertFalse(RegExprMain.validateEmail("adrian.gmail.com"));
        assertFalse(RegExprMain.validateEmail("adri2gmail.com"));
        assertFalse(RegExprMain.validateEmail("adri.bcn.98@@@gmail.com"));
    }

    @Test
    public void testValidateClave() {
        assertTrue(RegExprMain.validateClave("AA999AA"));
        assertTrue(RegExprMain.validateClave("BB888BB"));
        assertTrue(RegExprMain.validateClave("CC777CC"));
        assertTrue(RegExprMain.validateClave("DD666DD"));
        assertTrue(RegExprMain.validateClave("EE555EE"));
        assertFalse(RegExprMain.validateClave("11AAA11"));
        assertFalse(RegExprMain.validateClave("222BB222"));
        assertFalse(RegExprMain.validateClave("5H3335H"));
        assertFalse(RegExprMain.validateClave("NN666ÑÑ"));
        assertFalse(RegExprMain.validateClave("AA1234AA"));
    }
    
}
