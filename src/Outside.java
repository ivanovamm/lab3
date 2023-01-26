public class Outside extends Location{
    public Outside (String name){
        super(name);
    }
    @Override
    public String showLocation(){
        return super.showLocation();
    }
    @Override
    public String toString(){
        return("Outside" + this.showLocation());
    }
}