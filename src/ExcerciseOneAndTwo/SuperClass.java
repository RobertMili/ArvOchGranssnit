package ExcerciseOneAndTwo;

public class SuperClass  {
    private int pris = 10000;

    public SuperClass(int pris) {
        this.pris = pris;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }
    public void printOutONE(){
        System.out.println("Writing out something from superClass");
    }
    public void printOUTWO(){
        System.out.println("Writing out something from superClass");
    }


}
