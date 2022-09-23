package ExcerciseTwelve;

public class Dog implements NoiseMaker{
    private final String dog = "Dog";

    @Override
    public void makeNoise() {
        System.out.println("Vauw, vauw");
    }

    public String getDog() {
        return dog;
    }
}
