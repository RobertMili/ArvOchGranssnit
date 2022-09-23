package ExeceriseFive;

public class Sail extends Vehicle{
    private String sail = "sail";

    public String getSail() {
        return sail;
    }
    public Sail(){
        super();
    }
    @Override
    public void goTO(String location){
        System.out.println("Färdas till " + location + " " + getSail());
    }
}
