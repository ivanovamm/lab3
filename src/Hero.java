public abstract class Hero implements Movable {
    private String name;
    private Location location;
    private Mood mood;
    public Hero(){

    }

    public Hero (String name, Location location, Mood mood){
        this.name = name;
        this.location = location;
        this.getName();
        this.mood = mood;

    }

    public String getName(){
        return name;
    }


    public String showMood() {
        return mood.getName();
    }




    @Override
    public String setLocation(Location location) {
        return name + "переместился в " + location.showLocation();

    }
    public void setMood (Mood mood){
        this.mood = mood;
    }


    public abstract String walkAround(String direction);

    public String say(int loudness, String what){
        if (loudness<100){
            return "сказал" + what;
        }
        else{
            return "закричал" + what;
        }
    }
    public void sit(){
        System.out.println(name+"сел за стол");
    }
    public String sleep(String howlong, String purpose){
        return "спал "+ howlong + purpose ;
    }
    public String WakeUp(String when, String why){
        return "проснулся" + when + why;
    }
    public String sing(int volume, String what){
        if (volume>90) {
            return  "пела громко" + what;
        }
        else if (volume>10){
            return "пела тихо" + what;
        }
        else {
            return "пела" + what;
        }
    }
    public String see (String f) {
        if (f == "no") {
            return "не видел";
        }
        else {
            return "видел";
        }
    }
    public String go() {
        return "съездила";
    }
    public String think(String what){
        return "подумал" + what;
    }


}
