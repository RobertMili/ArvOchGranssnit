package ExcerciseTwelve;
/*
12 Skapa ett interface med namnet NoiseMaker. Det ska innehålla
en metod med namnet makeNoise.

 Ändra minst två djurklasser så att de implementerar interfacet.
 Lägg till en klass Robot som implementerar NoiseMaker men inte
 ärver från Animal.
 */

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.getDog());
        dog.makeNoise();

        System.out.println(cat.getCat());
        cat.makeNoise();
    }
}
