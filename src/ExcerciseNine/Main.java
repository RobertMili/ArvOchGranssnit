package ExcerciseNine;
/*
9 Skapa en abstrakt klass med minst en abstrakt metod.
Skapa en klass som ärver från den och implementerar
den abstrakta metoden.
 */

public class Main {

    public static void main(String[] args) {

        CarClass car = new CarClass();

        System.out.println(car.makeColor() + " its a color, and model it is : " + car.getCar());
    }

}
