public class House extends Location{
    public House (String name){
        super(name);
    }
    @Override
    public String showLocation(){
        return super.showLocation();
    }
    @Override
    public String toString(){
        return("House" + this.showLocation());
    }
}
