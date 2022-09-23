package ExcerciseTwelve;

public class Cat implements NoiseMaker{
    private final String cat = "cat";


    public String getCat() {
        return cat;
    }

    @Override
    public void makeNoise() {
        System.out.println("mjau, mjau");
    }
}
