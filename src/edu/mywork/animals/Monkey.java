
package edu.mywork.animals;

/**
 *
 * @author Saquib Ahmad
 */
import edu.mywork.animals.AnimalGender;
import edu.mywork.animals.Animal;
import edu.mywork.spaces.ISpaceNotifier;

public final class Monkey extends Animal {
    
    public static final int MinAge = 3;
    public static final int MaxAge = 15;

    public Monkey(String name, AnimalGender gender, int age, float weight){
            super(name, gender, age, weight);
            super.Speed = age >= 5 || age <= 12 ? 20 : 7;
    }

    public String Talk() { 
        return  String.format("I am Monkey {Name: %s, Gender: %s, Age: %d, Weight: %f }", Name, Gender, Age, Weight ); 
    }

    public void Walk(ISpaceNotifier notifier) { 
        RunningDistance = 0;
        int distance = R.nextInt(100);
        for(int i = 0; i< distance; i= i + 3  ) {
            notifier.Notify(3);
            RunningDistance += 3;
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
            return String.format("Monkey {Name: %s, Gender: %s, Age: %d, Weight: %f, Speed: %f }", Name, Gender, Age, Weight, Speed );
    }
}

