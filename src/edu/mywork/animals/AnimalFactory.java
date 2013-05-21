package edu.mywork.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Saquib Ahmad
 */
public class AnimalFactory {
 
    public static List<IAnimal> GetAnimals(int count){
        List<IAnimal> animals = new ArrayList<IAnimal>();
        Random r = new Random();
        for(int i=0; i<count; i++) {
            int index = r.nextInt(3);
            IAnimal animal = null;
            switch(index){
                case 0:
                    animal = new Human(getName(r, "human"), getGender(r), getAge(r, Human.MinAge, Human.MaxAge), getWeight(r, 20.0F, 120.0F) );
                    break;
                case 1:
                    animal = new Monkey(getName(r, "monkey"), getGender(r), getAge(r, Monkey.MinAge, Monkey.MaxAge), getWeight(r, 10.0F, 50.0F) );
                    break;
                case 2:
                    animal = new Biped(getName(r, "biped"), getGender(r), getAge(r, Biped.MinAge, Biped.MaxAge), getWeight(r, 5.0F, 150.0F) );
                    break;
                case 3:
                    animal = new Robot(getName(r, "robot"), getGender(r), getAge(r, Robot.MinAge, Robot.MaxAge), getWeight(r, 50.0F, 200.0F) );
                    break;
            }
            animals.add(animal);
        }
        return animals;
    }

    public static String getName(Random r, String name){
        int v = r.nextInt(100);
        return String.format("%s-%d", name, v==0 ? 1 : v );
    }

    public static AnimalGender getGender(Random r){
        return (r.nextBoolean() ?  AnimalGender.Male : AnimalGender.Female);
    }
    
    public static int getAge(Random r, int min, int max){
        int v = r.nextInt(max);
        return v < min ? min : v;
    }
    
    public static float getWeight(Random r, float min, float max){
        float v = r.nextFloat();
        return v == 0 ? min : v * max;
    }

    
}
