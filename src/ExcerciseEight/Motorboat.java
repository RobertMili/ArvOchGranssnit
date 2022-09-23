package ExcerciseEight;

public class Motorboat extends Vehicle {
    private final String motorboat = "motorboat";

    public Motorboat(String location) {
        super(location);
    }

    public String getMotorboat() {
        return motorboat;
    }
    public void goTo(){
        System.out.println("Färdas till " + getLocation() + " med " + getMotorboat());
    }
}
