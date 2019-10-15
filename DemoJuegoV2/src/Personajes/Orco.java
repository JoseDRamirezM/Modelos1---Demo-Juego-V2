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
public class Orco extends Personaje {
    
    @Override
    public void setTipo(){
        super.tipo = "Orco";
    }
    
    @Override
    public void setImgDir(){
        super.img = "/img/shrek.png";
    }
    
    public Orco(){
        super.tipo = "Orco";
        super.img = "/img/shrek.png";
    }
}
