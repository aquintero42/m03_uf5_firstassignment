/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.entidadfinanciera;

/**
 *
 * @author pep
 */
public abstract class CuentaCorrienteACredito extends CuentaCorrienteImpl {

    public CuentaCorrienteACredito(String titular, double saldo) {
        super(titular, saldo);
    }
    
}
