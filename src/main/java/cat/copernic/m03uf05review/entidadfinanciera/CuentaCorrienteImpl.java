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
public abstract class CuentaCorrienteImpl implements CuentaCorriente {
    
    private String titular;
    private double saldo;

    public CuentaCorrienteImpl(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
    
    @Override
    public String toString() {
        return "CuentaCorritenteImpl{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    @Override
    public void ingresa(double ingreso) {
        if (ingreso <= 0) {
            try {
                throw new Exception("Ingreso negativo: " + ingreso, new InvalidParameterException());
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        saldo += ingreso;
    }

    @Override
    public void abona(double abono) {
        if (abono <= 0) {
            try {
                throw new Exception("Abono negativo: " + abono, new InvalidParameterException());
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
        saldo -= abono;
    }

    
}
