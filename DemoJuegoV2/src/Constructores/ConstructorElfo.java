/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

import Fabricas.FabricaAbstracta;
import Fabricas.FabricaElfo;
import Personajes.Elfo;
import Personajes.Personaje;

/**
 *
 * @author estudiantes
 */
public class ConstructorElfo extends ConstructorPersonaje {

   
            
    @Override
    public void consruirPersonaje() {
        p = new Elfo();
    }

    @Override
    public void construirPartes() {
        f = new FabricaElfo();
        p.setArma(f.crearArma());
        p.setArmadura(f.crearAramadura());
        p.setEscudo(f.crearEscudo());
    }
    
    


    
}
