public class FairyCreature extends Hero implements Flyable{
    public FairyCreature (String name, Location location, Mood mood) {
        super(name, location, mood);

    }
    @Override
    public String getName() {
        return super.getName();
    }



    @Override
    public String fly() {
        return "влетел";
    }



    @Override
    public String setLocation(Location location) {
        return getName()+ " переместился за " + location.showLocation();

    }

    @Override
    public String walkAround(String direction) {
        return null;
    }



    @Override
    public void sit(){
        System.out.println("сел за стол");
    }
    public String praise(Hero who){
        return"расхваливал " + who.getName();
    }

}
