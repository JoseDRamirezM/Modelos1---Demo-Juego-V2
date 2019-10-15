/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armaduras.Armadura;
import Armaduras.ArmaduraDeHumano;
import Armas.Arma;
import Armas.Espada;
import Escudos.Escudo;
import Escudos.EscudoDeHumano;

/**
 *
 * @author USUARIO
 */
public class FabricaHumano implements FabricaAbstracta {

    @Override
    public Arma crearArma() {
        return new Espada();
    }

    @Override
    public Armadura crearAramadura() {
        return new ArmaduraDeHumano();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoDeHumano();
    }
    
}
