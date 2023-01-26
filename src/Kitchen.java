public class Kitchen extends Location{
    public Kitchen (String name){
        super(name);
    }
    @Override
    public String showLocation(){
        return super.showLocation();
    }
    @Override
    public String toString(){
        return("Kitchen" + this.showLocation());
    }
}