package ExerciseFour;

public class AnimalSuperClass {
    public String animal= "This is a animal: ";

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
    public void Animal(){
        Cat  cat = new Cat();
        System.out.println(cat.getCat());

        Dog dog = new Dog();
        System.out.println(dog.getDog());

        Bird bird = new Bird();
        System.out.println(bird.getBird());

        Fish fish = new Fish();
        System.out.println(fish.getFish());

    }
}
