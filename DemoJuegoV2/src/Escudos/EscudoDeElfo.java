/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escudos;

/**
 *
 * @author USUARIO
 */
public class EscudoDeElfo extends Escudo {

    @Override
    public void setEscudo(){
        super.nombre = "Escudo De Elfo";
    }
    
    @Override
    public void setImg(){
        super.img = "";
    }
    
    public EscudoDeElfo(){
        super.nombre = nombre;
        super.img = ""; 
    }
    
}
