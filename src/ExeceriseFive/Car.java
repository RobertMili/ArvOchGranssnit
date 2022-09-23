package ExeceriseFive;

public class Car extends Vehicle{
    private String car = "Car";

    public String getCar() {
        return car;
    }
    public Car(){
        super();
    }
    @Override
    public void goTO(String location){
        System.out.println("Färdas till " + location + " " + car);
    }
}
