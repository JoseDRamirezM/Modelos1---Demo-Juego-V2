/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;


import Fabricas.FabricaHumano;
import Personajes.Humano;


/**
 *
 * @author estudiantes
 */
public class ConstructorHumano extends ConstructorPersonaje{
    @Override
    public void consruirPersonaje() {
        p = new Humano();
    }

    @Override
    public void construirPartes() {
        f = new FabricaHumano();
        p.setArma(f.crearArma());
        p.setArmadura(f.crearAramadura());
        p.setEscudo(f.crearEscudo());
        
    }
    
}
