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
public class Arma {
    
    protected String nombre;
    protected String img;
    
    public void setArma(){
        
    }
    
    public String getArma(){
        return this.nombre;
    }
    
    public void setImgDir(){
        
    }
    
    public String getImgDir(){
        return this.img;
    }
        
    public Arma(){
        this.nombre = "Arma";
    }
}
