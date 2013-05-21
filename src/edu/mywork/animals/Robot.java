package edu.mywork.animals;

/**
 *
 * @author Saquib Ahmad
 */
import edu.mywork.animals.AnimalGender;
import edu.mywork.animals.Animal;
import edu.mywork.spaces.ISpaceNotifier;

public final class Robot extends Animal {
    
    public static final int MinAge = 1;
    public static final int MaxAge = 10;

    public Robot(String name, AnimalGender gender, int age, float weight){
            super(name, gender, age, weight);
            super.Speed = age >= 2 || age <= 8 ? 22 : 10;
    }

    public String Talk() { 
        return  String.format("I am Robot {Name: %s, Gender: %s, Age: %d, Weight: %f }", Name, Gender, Age, Weight ); 
    }

    public void Walk(ISpaceNotifier notifier) { 
        RunningDistance = 0;
        int distance = R.nextInt(100);
        for(int i = 0; i< distance; i= i + 5  ) {
            notifier.Notify(5);
            RunningDistance += 5;
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
            return String.format("Robot {Name: %s, Gender: %s, Age: %d, Weight: %f, Speed: %f }", Name, Gender, Age, Weight, Speed );
    }
}
