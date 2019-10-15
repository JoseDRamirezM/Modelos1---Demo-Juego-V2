/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armaduras.Armadura;
import Armas.Arma;
import Escudos.Escudo;

/**
 *
 * @author USUARIO
 */
public interface FabricaAbstracta {

    public Arma crearArma();
    
    public Armadura crearAramadura();
    
    public Escudo crearEscudo();
}
