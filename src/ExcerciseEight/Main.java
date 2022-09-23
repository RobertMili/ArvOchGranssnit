package ExcerciseEight;
/*

8 Använd konstruktorfunktioner i Vehicle och alla subklasser.
 Observera att en subklass ska anropa superklassens konstruktor
 med hjälp av super innan den gör något annat.
 */

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Götebor");
        Bicycle bicycle = new Bicycle("bicycle","Götebor");
        Car car = new Car("Malmö");
        Motorboat motorboat = new Motorboat("Marstrand");

        System.out.println(vehicle.getLocation());
        bicycle.goTo();
        car.GoTo();
        motorboat.goTo();

    }
}
