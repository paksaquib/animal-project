package edu.mywork.demos.console;

/**
 *
 * @author Saquib Ahmad
 */

import java.util.*;
import edu.mywork.animals.*;
import edu.mywork.demos.IDemo;

public class TalkDemo implements IDemo {

    public void show(List<IAnimal> animals){
        System.out.println("------------- demo Talk --------------");
        for(IAnimal each : animals){
            System.out.println(each.Talk());
        }
    }
    
}




