package ExcerciseEight;

public class Bicycle extends Vehicle {
    private final String Bicycle;

    public Bicycle(String bicycle, String location) {
        super(location);
        Bicycle = bicycle;
    }

    public String getBicycle() {
        return Bicycle;
    }
    public void goTo(){
        System.out.println("Färdas till " + getLocation() + " med " + getBicycle());
    }
}
