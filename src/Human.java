public class Human extends Hero{
    public Human (String name, Location location, Mood mood) {
        super(name, location, mood);

    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String setLocation(Location location) {
        return getName()+ " переместился за " + location.showLocation();
    }





    public String walkAround(String direction) {
        return("ходила"+direction);
    }
    public String cook(){
        return "готовит";
    }



    @Override
    public void sit(){
        System.out.println("сел за стол");
    }






}
