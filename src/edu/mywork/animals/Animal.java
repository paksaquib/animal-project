package edu.mywork.animals;

/**
 *
 * @author Saquib Ahmad
 */

import edu.mywork.animals.AnimalGender;
import edu.mywork.animals.IAnimal;
import edu.mywork.spaces.ISpace;
import edu.mywork.spaces.ISpaceNotifier;
import java.util.*;

public abstract class Animal implements IAnimal {

    protected static final Random R = new Random();
    
    protected Animal(String name, AnimalGender gender, int age, float weight ){
            Name = name;
            Gender = gender;
            Age = age;
            Weight = weight;
    }

    protected String Name;
    protected AnimalGender Gender;
    protected int Age;
    protected float Weight;
    protected int Speed;
    protected float Acceleration;
    protected float RunningDistance;
    protected float BodyLiftRatio;
    protected ISpace Space;

    public String getName() { return Name; }
    public AnimalGender getGender() { return Gender; }
    public int getAge() { return Age; }
    public float getWeight() { return Weight; }
    public int getSpeed() { return Speed; }
    public float getAcceleration() { return Acceleration; }
    public float getRunningDistance() { return RunningDistance; }
    public float getBodyLiftRatio() { return BodyLiftRatio; }

    public void setSpace(ISpace space) { Space = space;}
    public ISpace getSpace() { return Space; }

    public abstract String Talk();
    public abstract void Walk(ISpaceNotifier notifier);
    public abstract void Run(ISpaceNotifier notifier);
    public abstract void Turn();
    public abstract void Lift();
	
}
