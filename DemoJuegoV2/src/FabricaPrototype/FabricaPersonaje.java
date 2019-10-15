/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaPrototype;

import Personajes.Elfo;
import Personajes.Humano;
import Personajes.Personaje;

/**
 *
 * @author USUARIO
 */
public class FabricaPersonaje {
    
    private Humano humano;
    private Elfo elfo;
    
    public FabricaPersonaje(){
        humano = new Humano();
        elfo = new Elfo();               
    }
    
    public Personaje devolverPersonaje(String tipo){
        
        if("Humano".equals(tipo)){
            return (Personaje) humano.clone();
        }else if ("Elfo".equals(tipo)){
            return (Personaje) elfo.clone();
        }
        return null;
    }
    
}
