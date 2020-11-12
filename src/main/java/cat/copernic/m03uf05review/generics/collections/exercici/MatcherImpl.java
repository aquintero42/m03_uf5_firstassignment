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
    Persona persona;
    Persona match;
    // persona == . && candidatos.get(i) == .
    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        for(int i= 0; i< candidatos.size(); i++) {
            if (persona.getSexo() == Sexo.HOMBRE && candidatos.get(i).getSexo() == Sexo.HOMBRE) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                    if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) || (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }
                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                        
                    } else if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) || (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                    
                    }  
                } else if (persona.getOrientacionSexual() == OrientacionSexual.HETERO && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                    if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) || (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }
                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                        
                    } else if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) || (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                    
                    }                 
                } else if (persona.getOrientacionSexual() == OrientacionSexual.GAY && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                    if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) || (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }
                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                        
                    } else if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) || (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                    
                    }                 
                }
            } else if (persona.getSexo() == Sexo.MUJER && candidatos.get(i).getSexo() == Sexo.MUJER) {
                if (persona.getOrientacionSexual() == OrientacionSexual.BISEXUAL && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.BISEXUAL) {
                    if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) || (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }
                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                        
                    } else if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) || (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                    
                    }  
                } else if (persona.getOrientacionSexual() == OrientacionSexual.HETERO && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.HETERO) {
                    if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) || (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }
                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                        
                    } else if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) || (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                    
                    }                 
                } else if (persona.getOrientacionSexual() == OrientacionSexual.GAY && candidatos.get(i).getOrientacionSexual() == OrientacionSexual.GAY) {
                    if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_DERECHA) || (persona.getOrientacionPolitica() == OrientacionPolitica.DERECHA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.DERECHA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }
                    } else if (persona.getOrientacionPolitica() == OrientacionPolitica.CENTRO && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.CENTRO) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                        
                    } else if ( (persona.getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.EXTREMA_IZQUIERDA) || (persona.getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA && candidatos.get(i).getOrientacionPolitica() == OrientacionPolitica.IZQUIERDA) ) {
                        if ( (persona.getFormacion() == Formacion.DOCTORADO && candidatos.get(i).getFormacion() == Formacion.DOCTORADO) || (persona.getFormacion() == Formacion.CATEDRATICO && candidatos.get(i).getFormacion() == Formacion.CATEDRATICO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.GRADO_SUPERIOR && candidatos.get(i).getFormacion() == Formacion.GRADO_SUPERIOR) || (persona.getFormacion() == Formacion.GRADO_MEDIO && candidatos.get(i).getFormacion() == Formacion.GRADO_MEDIO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.BACHILLERATO && candidatos.get(i).getFormacion() == Formacion.BACHILLERATO) || (persona.getFormacion() == Formacion.GRADO && candidatos.get(i).getFormacion() == Formacion.GRADO) ) {
                            match = candidatos.get(i);
                        } else if ( (persona.getFormacion() == Formacion.SECUNDARIA && candidatos.get(i).getFormacion() == Formacion.SECUNDARIA) || (persona.getFormacion() == Formacion.PRIMARIA && candidatos.get(i).getFormacion() == Formacion.PRIMARIA) ) {
                            match = candidatos.get(i);
                        }                    
                    }                 
                }
            }
        //return match;
        }
        return match;
    }
}