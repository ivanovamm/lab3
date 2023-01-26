public enum Time {
    MORNING("Утром"), NIGHT("ночью"), LUNCH("обед"), EARLIER("Прежде");
    private String name;
    Time(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
