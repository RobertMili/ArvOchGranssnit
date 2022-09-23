package ExeceriseFive;

/*
5 Skapa en klasshierarki för olika sorters fordon.
Du ska alltså skapa klasser som ärver från varandra.
Du ska ha klasserna Vehicle, Bicycle, Boat, Car,
Motorboat och Sail.
 Vehicle ska ha en metod som heter goTo, som tar en parameter.
 Funktionen ska skriva ut "Färdas till [parametern]".
 Skapa ett objekt av varje klass och anropa goTo med ditt favoritresmål.
 */


/*
6 Gör så att klasserna som ärver från Vehicle skriver över goTo från
Vehicle med egna metoder.
 De ska skriva ut liknande saker som Vehicle.goTo(),
  men det ska framgå vilket fordon man åker med.
 Till exempel "Färdas med bil till [resmål]".
 */




public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        Car car = new Car();
        Motorboat motorboat = new Motorboat();
        Sail sail = new Sail();


        bicycle.goTO("Göteborg");
        boat.goTO("Marstrand");
        car.goTO("Stockholm");
        motorboat.goTO("Danmark");
        sail.goTO("Tyskland");

        System.out.println("\nNew excercise");
        Vehicle vehicle = new Bicycle();

        vehicle.goToBicycle("Göteborg");
        vehicle.goToBoat("Marstand");
        vehicle.goToCar("Stockholm");
        vehicle.goToMotorboat("Danmark");
        vehicle.goToMotorboat("Tyskland");

    }
}
