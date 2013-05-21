package edu.mywork.demos.console;

/**
 *
 * @author Saquib Ahmad
 */

import java.util.*;
import edu.mywork.animals.*;
import edu.mywork.spaces.*;
import edu.mywork.demos.IDemo;

public class Space3DRunDemo implements IDemo {

    public void show(List<IAnimal> animals){
        setSpace3D(animals);
        showMoveXOnly(animals);
    }

    public void showMoveXOnly(List<IAnimal> animals){
        for(IAnimal each : animals){
            final IAnimal animal = each;
            System.out.println(String.format("------------- %s: demo Run on x-path (3D) --------------", animal.getName()));
            each.Run(new ISpaceNotifier(){
                final public void Notify(int i){
                    Space3D space = (Space3D)animal.getSpace();
                    space.moveX(i);
                    System.out.println(String.format("%s %s", animal.getName(), space.getCurrent()));
                }
            });
        }
        
    }
    
    void setSpace3D(List<IAnimal> animals){
        for(IAnimal each : animals){
            each.setSpace(new Space3D());
        }
    }

}




