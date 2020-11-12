/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections.exercici;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pep
 */
public class ExerciciMain {

    public static void main(String[] args) {
        
        //Persona persona;
        List<Persona> candidatos = new ArrayList<>();
        MatcherImpl matcher = new MatcherImpl();
        
        candidatos.add(new Persona(1,Sexo.HOMBRE,22,true,OrientacionSexual.HETERO,Formacion.GRADO_SUPERIOR,OrientacionPolitica.IZQUIERDA));
        candidatos.add(new Persona(2,Sexo.HOMBRE,24,false,OrientacionSexual.BISEXUAL,Formacion.GRADO,OrientacionPolitica.EXTREMA_IZQUIERDA));
        candidatos.add(new Persona(3,Sexo.HOMBRE,18,false,OrientacionSexual.GAY,Formacion.BACHILLERATO,OrientacionPolitica.CENTRO));
        candidatos.add(new Persona(4,Sexo.HOMBRE,40,false,OrientacionSexual.BISEXUAL,Formacion.CATEDRATICO,OrientacionPolitica.DERECHA));
        candidatos.add(new Persona(5,Sexo.HOMBRE,22,true,OrientacionSexual.HETERO,Formacion.GRADO_MEDIO,OrientacionPolitica.EXTREMA_DERECHA));
        candidatos.add(new Persona(6,Sexo.MUJER,26,false,OrientacionSexual.HETERO,Formacion.GRADO_SUPERIOR,OrientacionPolitica.EXTREMA_DERECHA));
        candidatos.add(new Persona(7,Sexo.MUJER,27,false,OrientacionSexual.LESBIANA,Formacion.DOCTORADO,OrientacionPolitica.DERECHA));
        candidatos.add(new Persona(8,Sexo.MUJER,18,true,OrientacionSexual.BISEXUAL,Formacion.BACHILLERATO,OrientacionPolitica.CENTRO));
        candidatos.add(new Persona(9,Sexo.MUJER,25,false,OrientacionSexual.HETERO,Formacion.GRADO_SUPERIOR,OrientacionPolitica.IZQUIERDA));
        candidatos.add(new Persona(10,Sexo.MUJER,28,true,OrientacionSexual.BISEXUAL,Formacion.DOCTORADO,OrientacionPolitica.EXTREMA_IZQUIERDA));
        
        System.out.println(matcher.matches(new Persona(11,Sexo.HOMBRE,20,false,OrientacionSexual.GAY,Formacion.BACHILLERATO,OrientacionPolitica.CENTRO), candidatos));
        /*for(Iterator it = candidatos.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }*/
     
        
    }
    
}
