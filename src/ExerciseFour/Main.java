package ExerciseFour;
/*
4 Skriv minst fyra klasser som motsvarar olika djur.
 Alla djur ska ha Animal som första superklass.
Andra superklasser som kan vara bra att ha med är Bird, Mammal, Fish osv.
Se till att de ärver från Animal och att klasserna för respektive
djur ärver från rätt klass.
 */

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.animal  + cat.getCat());

        Dog dog = new Dog();
        System.out.println(dog.animal + dog.getDog());

        Bird bird = new Bird();
        System.out.println(bird.animal + bird.getBird());

        Fish fish = new Fish();
        System.out.println(fish.animal + fish.getFish());

        System.out.println("\nCalling another superClass: \n");

        BirdSuperClass birdSuperClass = new BirdSuperClass();
        System.out.println(birdSuperClass.getBirdSecond() + birdSuperClass.getBird());


        MammalSuperClass mammalSuperClass = new MammalSuperClass();
        System.out.println(mammalSuperClass.getMamal() + mammalSuperClass.getCat());

        FIshSuperClass fIshSuperClass = new FIshSuperClass();
        System.out.println(fIshSuperClass.getFishClass() + fIshSuperClass.getFish());


        System.out.println("\nCalling all from supperClass");
        AnimalSuperClass animal2 = new AnimalSuperClass();
        animal2.Animal();
    }
}
