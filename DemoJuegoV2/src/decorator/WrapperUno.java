/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import Personajes.Personaje;

/**
 *
 * @author USUARIO
 */
public class WrapperUno extends Wrapper {

    public WrapperUno(Component p) {
        super(p);
    }
    
    private int[] v = new int[4];

    @Override
    public int[] doThis(int frames, int posix, int posiy, int i) {
        frames = 13;
        posix = 64;
        posiy = 128;
        i = 832;
        v[0] = frames;
        v[1] = posix;
        v[2] = posiy;
        v[3] = i;
        
        return v;
    }

 

    
}
