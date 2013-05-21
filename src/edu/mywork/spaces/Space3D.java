package edu.mywork.spaces;

/**
 *
 * @author Saquib Ahmad
 */

import edu.mywork.spaces.ISpace;


public class Space3D implements ISpace {
    
    private int X;
    private int Y;
    private int Z;
    
    public String getCurrent(){
        return String.format("(x: %d, y: %d, z: %d)", X, Y, Z);
    }
    
    public void moveUnit(){
        X += 1;
        Y += 1;
        Z += 1;
    }
    
    public void moveX(int x){
        X += x;
    }
    
    public void moveY(int y){
        Y += y;
    }

    public void moveZ(int z){
        Z += z;
    }
}
