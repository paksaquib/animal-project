package edu.mywork.demos.console;

/**
 *
 * @author Saquib Ahmad
 */
import java.util.*;
import edu.mywork.animals.*;
import edu.mywork.spaces.*;
import edu.mywork.demos.IDemo;

public class Space2DRunDemo implements IDemo {

    public void show(List<IAnimal> animals){
        setSpace2D(animals);
        showMoveXOnly(animals);
    }

    public void showMoveXOnly(List<IAnimal> animals){
        for(IAnimal each : animals){
            final IAnimal animal = each;
            System.out.println(String.format("------------- %s: demo Run on x-path (2D) --------------", animal.getName()));
            each.Run(new ISpaceNotifier(){
                final public void Notify(int i){
                    Space2D space = (Space2D)animal.getSpace();
                    space.moveX(i);
                    System.out.println(String.format("%s %s", animal.getName(), space.getCurrent()));
                }
            });
        }
        
    }
    
    void setSpace2D(List<IAnimal> animals){
        for(IAnimal each : animals){
            each.setSpace(new Space2D());
        }
    }

}




