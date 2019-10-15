/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author USUARIO
 */
public class Teclado implements KeyListener {
    
    private final static int numeroTeclas = 120;
    private final boolean[] teclas = new boolean[numeroTeclas];
    
    public boolean arriba;
    public boolean abajo;
    public boolean izquierda;
    public boolean derecha;
    public boolean atacar;
    public boolean arriba1;
    public boolean abajo1;
    public boolean izquierda1;
    public boolean derecha1;
    public boolean atacar1;
    public boolean estado;
    public boolean estado1;
    
    public void actualizar(){
        arriba = teclas[KeyEvent.VK_W];
        abajo = teclas[KeyEvent.VK_S];
        derecha = teclas[KeyEvent.VK_D];
        izquierda = teclas[KeyEvent.VK_A];
        atacar = teclas[KeyEvent.VK_X];
        arriba1 = teclas[KeyEvent.VK_UP];
        abajo1 = teclas[KeyEvent.VK_DOWN];
        derecha1 = teclas[KeyEvent.VK_RIGHT];
        izquierda1 = teclas[KeyEvent.VK_LEFT];
        atacar1 = teclas[KeyEvent.VK_SPACE];
    }
    
    @Override
    public void keyTyped(KeyEvent e) {    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()] = true;
        if(arriba || abajo || derecha || izquierda || atacar){
            estado = true;
        }else if(arriba1 || abajo1 || derecha1 || izquierda1 || atacar1){
            estado1 = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        teclas[e.getKeyCode()] = false;
        estado = false;
        estado1 = false;
    }
    
}
