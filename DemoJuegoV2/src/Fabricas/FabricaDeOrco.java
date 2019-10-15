/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armaduras.Armadura;
import Armaduras.ArmaduraDeOrco;
import Armas.Arma;
import Armas.Hacha;
import Escudos.Escudo;
import Escudos.EscudoDeOrco;

/**
 *
 * @author estudiantes
 */
public class FabricaDeOrco implements FabricaAbstracta {

    @Override
    public Arma crearArma() {
        return new Hacha();
    }

    @Override
    public Armadura crearAramadura() {
        return new ArmaduraDeOrco();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoDeOrco();
    }

   

}
