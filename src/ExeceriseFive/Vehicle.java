package ExeceriseFive;

public abstract class Vehicle {
    private String location = "";

    public Vehicle() {
    }

    public void goTO(String location) {
        System.out.println("Färdas till " + location);
    }
    public void goToBicycle(String location){
        System.out.println("Färdas till " + location + " med " + Bicycle());
    }
    public void goToBoat(String location){
        System.out.println("Färdas till " + location + " med " + Boat());
    }
    public void goToCar(String location){
        System.out.println("Färdas till " + location + " med " + Car());
    }
    public void goToMotorboat(String location){
        System.out.println("Färdas till " + location + " med " + Motorboat());
    }
    public void goToSail(String location){
        System.out.println("Färdas till " + location + " med " + Sail());
    }
    public String Bicycle(){
        Bicycle bicycle = new Bicycle();
        return bicycle.getBicycle();
    }
    public String Boat(){
        Boat boat = new Boat();
        return boat.getBoat();
    }
    public String Car(){
        Car car = new Car();
        return car.getCar();
    }
    public String Motorboat(){
        Motorboat motorboat = new Motorboat();
        return motorboat.getMotorboat();
    }
    public String Sail(){
        Sail sail = new Sail();
        return sail.getSail();
    }

}
