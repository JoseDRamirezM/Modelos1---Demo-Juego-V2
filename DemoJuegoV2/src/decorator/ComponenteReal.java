/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ComponenteReal implements Component{
    
    private int[] v  = new int[4];

    @Override
    public int[] doThis(int frames, int posix, int posiy, int i) {
        frames = 6;
        posix = 128;
        posiy = 192;
        i = 640;
        v[0] = frames;
        v[1] = posix;
        v[2] = posiy;
        v[3] = i;
        
        return v;
    }
    
}
