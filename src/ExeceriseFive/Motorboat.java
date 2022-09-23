package ExeceriseFive;

public class Motorboat extends Vehicle{
    private String motorboat = "motorboat";

    public String getMotorboat() {
        return motorboat;
    }
    public Motorboat(){
        super();
    }
    @Override
    public void goTO(String location){
        System.out.println("Färdas till " + location + " " + getMotorboat());
    }

}
