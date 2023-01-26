public class Bedroom extends Location{
    public Bedroom (String name){
        super(name);
    }
    @Override
    public String showLocation(){
        return super.showLocation();
    }
    @Override
    public String toString(){
        return("Bedroom" + this.showLocation());
    }
}