/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Constructores.ConstructorElfo;
import Constructores.ConstructorHumano;
import FabricaPrototype.FabricaPersonaje;
import Graficos.Frame;
import Graficos.Sprite;
import Personajes.Personaje;
import javax.swing.JOptionPane;



public class Juego {

    public static void main(String args[]){
        String sN1;
        String sN2;
        
        int nH;
        int nE;
        
        Personaje p1 = new Personaje();
        Personaje p2 = new Personaje();
        
        Personaje[] psElfos;
        Personaje[] psHumanos;
               
        FabricaPersonaje fb;
        fb = new FabricaPersonaje(); //Fabrica que contiene y retorna los prototipos
        
        sN1 = JOptionPane.showInputDialog("Ingrese numero de humanos");
        sN2 = JOptionPane.showInputDialog("Ingrese numero de elfos ");
        
             
        nH = Integer.parseInt(sN1);
        nE = Integer.parseInt(sN2);
               
        
        if(nH > 0 && nE > 0){
            
            psHumanos = new Personaje[nH];
            psElfos = new Personaje[nE];
            
            for(int x = 0 ; x > nH; x++){
                psHumanos[x] = fb.devolverPersonaje("Humano");//Creamos el numero de objetos especificados por el usuario
            }
            for(int x = 0 ; x > nE; x++){
                psElfos[x] = fb.devolverPersonaje("Elfo");
            }
            
                    
            Sprite s = new Sprite(fb.devolverPersonaje("Elfo").getImgDir(),   fb.devolverPersonaje("Humano").getImgDir(), nH, nE);
            Frame f = new Frame();
                        
            System.out.println(fb.devolverPersonaje("Humano").getTipo());
            System.out.println(fb.devolverPersonaje("Elfo").getTipo());
            System.out.println(fb.devolverPersonaje("Elfo").getImgDir());
            System.out.println("Poblacion de Humanos: " + psHumanos.length);
            System.out.println("Poblacion de Elfos: " + psElfos.length);
            
        }else {
            JOptionPane.showMessageDialog( null ,"Verifique los datos");
        }
        
    }
}
