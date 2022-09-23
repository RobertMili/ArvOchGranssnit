package ExcerciseOneAndTwo;
/*
1 Skriv en klass som ärver från en annan klass.
Superklassen ska vara något generellt och subklassen något mer specifikt.
Skapa objekt av båda klasserna för att kontrollera att du har gjort rätt.
 */

/*
2 Skapa två publika metoder i superklassen från förra uppgiften.
Metoderna ska skriva ut något så att man ser att de körs.
Lägg till en av metoderna i subklassen.
 Skapa ett objekt av subklassen och testa vad som händer när du
 anropar båda funktionerna från superklassen.
 */

/*
3 Ändra metoden i subklassen så att den även
anropar metoden i superklassen med hjälp av super.
 */


public class Main {
    public static void main(String[] args) {

    SuperClass superClass = new SuperClass(1000);

        System.out.println("This is a superClass " + superClass.getPris());

        SubClass subClass = new SubClass(superClass.getPris(), "Bmw");

        System.out.println(subClass.getModelPris());

        System.out.println("New exercise");
        superClass.printOutONE();
        superClass.printOUTWO();
        System.out.println("");
        subClass.printOutONE();
        System.out.println("New Exercise:");

        SuperClass superClass1 = new SuperClass(10);
        superClass1.getPris();
        SubClass subClass1 = new SubClass(10,"Bmw");
    }
}
