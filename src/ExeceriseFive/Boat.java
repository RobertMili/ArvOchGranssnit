package ExeceriseFive;

public class Boat extends Vehicle{
    private String boat = "boat";

    public String getBoat() {
        return boat;
    }
    public Boat(){
        super();
    }
    @Override
    public void goTO(String location){
        System.out.println("Färdas till " + location + " " + boat);
    }
}
