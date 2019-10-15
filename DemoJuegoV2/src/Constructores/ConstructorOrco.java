/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

import Fabricas.FabricaDeOrco;
import Personajes.Orco;

/**
 *
 * @author estudiantes
 */
public class ConstructorOrco extends ConstructorPersonaje {

    @Override
    public void consruirPersonaje() {
        p = new Orco();
    }

    @Override
    public void construirPartes() {
        f = new FabricaDeOrco();
        p.setArma(f.crearArma());
        p.setArmadura(f.crearAramadura());
        p.setEscudo(f.crearEscudo());
        
    }
    
}
