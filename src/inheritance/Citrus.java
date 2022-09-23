package inheritance;

public class Citrus extends Fruit{
    @Override
    public void printFruit(){
        System.out.println("This is a citrus");
        super.printFruit();
    }
}
