/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escudos;

/**
 *
 * @author estudiantes
 */
public class EscudoDeOrco extends Escudo {

    @Override
    public void setEscudo() {
        super.nombre = "Escudo de Orco";
    }

    @Override
    public void setImg() {
        super.img = "";
    }

    public EscudoDeOrco() {
        super.nombre = nombre;
        super.img = "";
    }

}
