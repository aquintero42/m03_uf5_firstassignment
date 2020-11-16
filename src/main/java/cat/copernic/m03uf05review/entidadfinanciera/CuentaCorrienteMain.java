/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.entidadfinanciera;

/**
 *
 * @author Adrian
 */
public class CuentaCorrienteMain {
    
    public static void main(String[] args) {
        CuentaCorriente cuentaDebito = new CuentaCorrienteADebito("Adrian",4000.0);
        //cuentaDebito.abona(-1000.0);
        cuentaDebito.abona(4000.50);
        //cuentaDebito.ingresa(-500.0);
        System.out.println(cuentaDebito);
        /*CuentaCorriente cuentaGold = new CuentaCorrienteACreditoGold("Juan",10000.0);
        cuentaGold.abona(3001.0);        
        CuentaCorriente cuentaPlatinum = new CuentaCorrienteACreditoPlatinum("Juan",10000.0);
        cuentaPlatinum.abona(5001.0);
        System.out.println(cuentaPlatinum);*/
    }
    
}
