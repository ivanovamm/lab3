public enum Mood {
    INGOODMOOOD ("в отличном настроении"), CHEERFUL("была бодрая"), DISMAL("угрюмо"), PLEASED(" был доволен обедом"), SLEEPY(""), NO("");
    private String name;
    Mood (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
