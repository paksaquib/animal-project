package edu.mywork;

/**
 *
 * @author Saquib Ahmad
 */

import java.util.*;
import edu.mywork.animals.*;
import edu.mywork.demos.IDemo;
import edu.mywork.demos.console.*;

public class AnimalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<IAnimal> animals = AnimalFactory.GetAnimals(2);
        IDemo demo = null;
        
        demo = new TalkDemo();
        demo.show(animals);
        
        demo = new Space2DWalkDemo();
        demo.show(animals);
        
        demo = new Space2DRunDemo();
        demo.show(animals);
        
        demo = new Space3DWalkDemo();
        demo.show(animals);
        
        demo = new Space3DRunDemo();
        demo.show(animals);
    }
    
}
