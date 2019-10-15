/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 *
 * @author USUARIO
 */
public class Hacha extends Arma {
    
    @Override
    public void setArma(){
        super.nombre = "Hacha";
    }
    
    @Override
    public void setImgDir(){
        super.img = "img/hacha.png";
    }
    
    public Hacha(){
        super.nombre = "Hacha";
        super.img = "img/hacha.png";
    }
}
