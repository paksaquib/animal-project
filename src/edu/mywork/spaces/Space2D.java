package edu.mywork.spaces;

/**
 *
 * @author Saquib Ahmad
 */

import edu.mywork.spaces.ISpace;

public class Space2D implements ISpace {
    
    private int X;
    private int Y;
    
    public String getCurrent(){
        return String.format("(x: %d, y: %d)", X, Y);
    }
    
    public void moveUnit(){
        X += 1;
        Y += 1;
    }
    
    public void moveX(int x){
        X += x;
    }
    
    public void moveY(int y){
        Y += y;
    }
}
