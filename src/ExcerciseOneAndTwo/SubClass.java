package ExcerciseOneAndTwo;

public class SubClass extends SuperClass{
    private String model = "BMW";


    public SubClass(int pris, String model) {
        super(pris);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
   public String getModelPris(){
       return "This is pris from superclass: " + getPris() + "\nand this is from subClas " + model;

   }

    @Override
    public void printOutONE() {
        System.out.println("This is from superClass and print out i subClas:");
        super.printOutONE();
    }

}

