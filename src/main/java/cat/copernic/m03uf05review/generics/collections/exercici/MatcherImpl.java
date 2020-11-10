/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections.exercici;

import java.util.List;

/**
 *
 * @author pep
 */
public class MatcherImpl implements Matcher {
    
    Persona match;
    
    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        for(int i= 0; i< candidatos.size(); i++) {
            
            if (candidatos.get(i).equals(Sexo.HOMBRE)) {
                if(candidatos.get(i).equals(OrientacionSexual.GAY)) {
                    match = candidatos.get(i);
                } else if (candidatos.get(i).equals(OrientacionSexual.HETERO)) {
                    match = candidatos.get(i);
                } else if (candidatos.get(i).equals(OrientacionSexual.BISEXUAL)) {
                    match = candidatos.get(i);
                }                
            } else if (candidatos.get(i).equals(Sexo.MUJER)) {
                if(candidatos.get(i).equals(OrientacionSexual.LESBIANA)) {
                    match = candidatos.get(i);
                } else if (candidatos.get(i).equals(OrientacionSexual.HETERO)) {
                    match = candidatos.get(i);
                } else if (candidatos.get(i).equals(OrientacionSexual.BISEXUAL)) {
                    match = candidatos.get(i);
                }                   
            }
            /*if( candidatos.equals(Sexo.HOMBRE)) {
                if(candidatos.equals(OrientacionSexual.GAY)) {
                    match = candidatos.get(i);
                } else if (candidatos.equals(OrientacionSexual.HETERO)) {
                    match = candidatos.get(i);
                } else if (candidatos.equals(OrientacionSexual.BISEXUAL)) {
                    match = candidatos.get(i);
                }
            } else if (candidatos.equals(Sexo.MUJER)) {
                if(candidatos.equals(OrientacionSexual.LESBIANA)) {
                    match = candidatos.get(i);
                } else if (candidatos.equals(OrientacionSexual.HETERO)) {
                    match = candidatos.get(i);
                } else if (candidatos.equals(OrientacionSexual.BISEXUAL)) {
                    match = candidatos.get(i);
                }                
            } else if (candidatos.equals(OrientacionPolitica.EXTREMA_DERECHA)) {
                if(candidatos.equals(OrientacionPolitica.EXTREMA_DERECHA)) {
                    match = candidatos.get(i);
                } else if (candidatos.equals(OrientacionPolitica.DERECHA)) {
                    match = candidatos.get(i);
                } else if (candidatos.equals(OrientacionPolitica.CENTRO)) {
                    match = candidatos.get(i);
                }                 
            } else if (candidatos.equals(OrientacionPolitica.EXTREMA_IZQUIERDA)) {
                if(candidatos.equals(OrientacionPolitica.EXTREMA_IZQUIERDA)) {
                    match = candidatos.get(i);
                } else if (candidatos.equals(OrientacionPolitica.IZQUIERDA)) {
                    match = candidatos.get(i);
                } else if (candidatos.equals(OrientacionPolitica.CENTRO)) {
                    match = candidatos.get(i);
                }              
            }*/
        return match;
        }
        return match;
    }
}