/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armaduras;

/**
 *
 * @author USUARIO
 */
public class ArmaduraDeOrco extends Armadura {
    
    @Override
    public void setArmadura(){
        super.nombre = "Armadura de Guerrero";
    }
    
    @Override
    public void setImgDir(){
        super.img = "img/armaduraDeGuerrero.png";
    }
    
    public ArmaduraDeOrco(){
        super.nombre = "Armadura de Guerrero";
        super.img = "img/armaduraDeGuerrero.png";
    }
}
