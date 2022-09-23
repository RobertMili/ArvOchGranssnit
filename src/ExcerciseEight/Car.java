package ExcerciseEight;

public class Car extends Vehicle{
    private final String car = "Car ";

    public Car(String location) {
        super(location);
    }

    public String getCar() {
        return car;
    }
    public void GoTo(){
        System.out.println("Färdas till " + getLocation() + " med " + getCar());
    }
}
