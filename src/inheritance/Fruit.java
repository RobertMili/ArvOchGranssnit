package inheritance;

public class Fruit {
    public static void main(String[] args) {
        var firstFruit = new Fruit();
        var firstCitrus = new Citrus();
        Fruit thirdCitrus = new Citrus();
        var secondCitrus = Fruit.createCitrus();
        var integerValue = 10.0;

        firstFruit.printFruit();
        firstFruit.allFruits();

        firstCitrus.printFruit();
        firstCitrus.allFruits();

        thirdCitrus.printFruit();
        thirdCitrus.allFruits();

//        if (thirdCitrus instanceof  Citrus){
//            System.out.println("This is a citrusFruit");
//        }else{
//            System.out.println("This is a fruit");
//        }


    }
    public static Citrus createCitrus(){
        Citrus citrus = new Citrus();
        return citrus;
    }
    public void printFruit(){
        System.out.println("This is a fruit");
    }
    public void allFruits(){
        System.out.println("Everything is s fruit, kind of ");
    }
}
