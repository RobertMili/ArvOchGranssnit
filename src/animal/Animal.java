package animal;

public class Animal {
    private int weight;
    private String sound;
    private String name;

    public Animal(int weight, String sound, String name) {
        this.weight = weight;
        this.sound = sound;
        this.name = name;
    }

    public void run(){
        System.out.println("Im running");
    }
    public void makeSound(){
        System.out.println(sound);
    }
}
