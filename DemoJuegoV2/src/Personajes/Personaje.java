/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import Armaduras.Armadura;
import Armas.Arma;
import Escudos.Escudo;

/**
 *
 * @author USUARIO
 */
public class Personaje implements Cloneable {

    private String nombre;
    protected String tipo;
    protected String img;
    private Arma arma;
    private Armadura armadura;
    private Escudo escudo;

       
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTipo(){
        
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setImgDir(){
        
    }
    
    public String getImgDir(){
        return this.img;
    }
    
    public void setArma(Arma a){
        this.arma = a;
    }
    
    public Arma getArma(){
        return this.arma;
    }
    
    public void setArmadura(Armadura ar){
        this.armadura = ar;
    }
    
    public Armadura getArmadura(){
        return this.armadura;
    }
    
    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public Escudo getEscudo() {
        return escudo;
    }
    
    public Personaje(){
        this.nombre = "N/D";
        this.arma = new Arma();
        this.armadura = new Armadura();
        this.escudo = new Escudo();
    }
    
    @Override
    public Personaje clone(){
        Personaje personajeClonado = null;
        try{
            personajeClonado = (Personaje) super.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        
        return personajeClonado;
    }
}
