/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author USUARIO
 */
public class Elfo extends Personaje{

    @Override
    public void setTipo(){
        super.tipo = "Elfo";
    }
    
    @Override
    public void setImgDir(){
        super.img = "/img/spriteElfo.png";
    }
    
    public Elfo(){
        super.tipo = "Elfo";
        super.img = "/img/spriteElfo.png";
    }
}
