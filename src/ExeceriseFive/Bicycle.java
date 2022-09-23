package ExeceriseFive;

public class Bicycle extends Vehicle{
    public String bicycle = "bicycle";

    public Bicycle() {
       super();
    }
    @Override
    public void goTO(String location) {
        System.out.println("Färdas till " + location+ " " + bicycle);
    }

    public String getBicycle() {
        return bicycle;
    }

    }

