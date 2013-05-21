package edu.mywork.animals;

/**
 *
 * @author Saquib Ahmad
 */

import edu.mywork.animals.AnimalGender;
import edu.mywork.spaces.ISpace;
import edu.mywork.spaces.ISpaceNotifier;

public interface IAnimal {
    public String getName();
    public AnimalGender getGender();
    public int getAge();
    public float getWeight();
    public int getSpeed();
    public float getAcceleration();
    public float getRunningDistance();
    public float getBodyLiftRatio();

    public String Talk();
    public void Walk(ISpaceNotifier notifier);
    public void Run(ISpaceNotifier notifier);
    public void Turn();
    public void Lift();

    public void setSpace(ISpace space);
    public ISpace getSpace();
       
}
