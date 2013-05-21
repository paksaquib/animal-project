package edu.mywork.animals;

/**
 *
 * @author Saquib Ahmad
 */
import edu.mywork.animals.AnimalGender;
import edu.mywork.animals.Animal;
import edu.mywork.spaces.ISpaceNotifier;

public final class Human extends Animal {

    public static final int MinAge = 10;
    public static final int MaxAge = 60;
    
    public Human(String name, AnimalGender gender, int age, float weight){
            super(name, gender, age, weight);
            super.Speed = age >= 12 || age <= 40 ? 15 : 7;
    }

    public String Talk() { 
        return  String.format("I am Human {Name: %s, Gender: %s, Age: %d, Weight: %f }", Name, Gender, Age, Weight ); 
    }
        
    public void Walk(ISpaceNotifier notifier) { 
        RunningDistance = 0;
        int distance = R.nextInt(100);
        for(int i = 0; i< distance; i= i + 2  ) {
            notifier.Notify(2);
            RunningDistance += 2;
        }
    }

    public void Run(ISpaceNotifier notifier) { 
        RunningDistance = 0;
        int distance = R.nextInt(100);
        for(int i = 0; i< distance; i= i + Speed) {
            notifier.Notify(Speed);
            RunningDistance += Speed;
        }
    }        

    public void Turn() { }

    public void Lift() { }

    @Override public String toString() {
            return String.format("Human {Name: %s, Gender: %s, Age: %d, Weight: %f, Speed: %f }", Name, Gender, Age, Weight, Speed );
    }
}
