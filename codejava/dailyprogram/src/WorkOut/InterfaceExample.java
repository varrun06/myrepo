package WorkOut;

// Define the Exercise interface
interface Exercise {
    void doExercise();
}

// Implement the Exercise interface in a class
class GymTraining implements Exercise {
    // Implement the doExercise method from the interface
    @Override
    public void doExercise() {
        System.out.println("Performing gym exercises!");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        // Create an instance of the class that implements the Exercise interface
        GymTraining gymSession = new GymTraining();

        // Call the doExercise method through the interface
        gymSession.doExercise();
    }
}
