/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.entidadfinanciera;

import java.security.InvalidParameterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pep
 */
public class CuentaCorrienteADebito extends CuentaCorrienteImpl {

    public CuentaCorrienteADebito(String titular, double saldo) {
        super(titular, saldo);
    }

    /**
     * 
     * Solamente se da un abono si hay saldo, si no se lanza una exception
     * 
     * @param abono 
     * @throws java.lang.Exception 
     */
    @Override
    public void abona(double abono) {
        if (abono >= getSaldo()) {
            try {
                throw new Exception("Saldo insuficiente: " + getSaldo(), new InvalidParameterException());
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            setSaldo(getSaldo() - abono);
        }
    }
    
}
