/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author Jose Ramirez
 */
public class Humano extends Personaje {
    
    @Override
    public void setTipo(){
        super.tipo = "Humano";        
    }
    
    @Override
    public void setImgDir(){
        super.img = "/img/spriteHumano.png";
    }
    
    public Humano(){
        super.tipo = "Humano";
        super.img = "/img/spriteHumano.png";
    }
}
