/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armaduras.Armadura;
import Armaduras.ArmaduraDeElfo;
import Armaduras.ArmaduraDeHumano;
import Armas.Arco;
import Armas.Arma;
import Escudos.Escudo;
import Escudos.EscudoDeElfo;

/**
 *
 * @author USUARIO
 */
public class FabricaElfo implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new Arco();
    }

    @Override
    public Armadura crearAramadura() {
        return new ArmaduraDeElfo();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoDeElfo();
    }
}
