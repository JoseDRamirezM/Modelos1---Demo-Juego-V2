/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 *
 * @author Jose Ramirez
 */
public class Arco extends Arma {

    @Override
    public void setArma(){
        super.nombre = "Arco";
    }
    
    @Override
    public void setImgDir(){
        super.img = "img/arco.png";
    }
    

    public Arco(){
        super.nombre = "Arco";
        super.img = "img/arco.png";
    }
    
}
