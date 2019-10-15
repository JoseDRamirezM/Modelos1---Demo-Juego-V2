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
public class ArmaduraDeElfo extends Armadura {
         
    @Override
    public void setArmadura(){
        super.nombre = "Armadura Ligera";
    }
    
    @Override
    public void setImgDir(){
        this.img = "img/armaduraLigera.png"; 
    }      
    
    public ArmaduraDeElfo(){
        super.nombre = "Armadura Ligera";
        this.img = "img/armaduraLigera.png";
    }
}
