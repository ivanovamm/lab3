public  abstract class Location {
    private String name;
    public Location (String name){
        this.name = name;
    }
    public String showLocation(){
        return name;
    }
}
