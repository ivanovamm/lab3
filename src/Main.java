public class Main {
    public static void main(String[] args) {
        Location kitchen = new Kitchen("кухня");
        Location bedroom = new Bedroom("спальня");
        Location house = new House("дом");
        Location table = new Kitchen("стол");
        Food eskalop = new Food("эскалопы");
        Human Malish = new Human("Малыш ", bedroom, Mood.SLEEPY);
        Human Frekenbok = new Human("Фрекенбок ", house, Mood.INGOODMOOOD );
        Human Julius = new Human ("Дядя Юлиус", house, Mood.NO);
        Human Frida = new Human("Фрида", house, Mood.NO);
        FairyCreature Karlson = new FairyCreature("Карлсон", kitchen, Mood.PLEASED);
        System.out.println(Malish.getName() + Malish.sleep("долго ", "из-за возни с ворами") );
        System.out.println(Malish.getName()+ Malish.WakeUp(" незадолго до прилета "+ Karlson.getName() +"а ", "из-за необычного звука"));
        System.out.println(Frekenbok.getName()+Frekenbok.walkAround(" взад-вперед") + " и " + Frekenbok.sing(100, ""));
        System.out.println(Time.EARLIER.getName()+ " "+ Malish.getName()+ Malish.see("no") + " как " + Frekenbok.getName() + Frekenbok.sing(0, ""));
        System.out.println("Она была " + Mood.INGOODMOOOD.getName());
        System.out.println (Time.MORNING.getName()+" "+Frekenbok.getName()+Frekenbok.go()+" "+ house.showLocation()+"ой к "+Frida.getName());
        Frekenbok.setMood(Mood.CHEERFUL);
        System.out.println(Frekenbok.getName()+Frekenbok.showMood());
        System.out.println(Frekenbok.getName()+ Frekenbok.sing(0,": \"Ах, Фрида, это было бы для тебя лучше!...\""));
        System.out.println(Karlson.getName()+" "+Karlson.fly()+" на "+kitchen.showLocation()+ " и " + Karlson.say(200, ""));
        Frekenbok.setMood(Mood.DISMAL);
        System.out.println(Frekenbok.getName()+Frekenbok.showMood()+" "+ Frekenbok.cook()+" "+ eskalop.getName());
        System.out.println(Julius.setLocation(house));
        System.out.println(Malish.setLocation(table));
        System.out.println(Frekenbok.setLocation(table));
        System.out.println(Karlson.setLocation(table));
        System.out.println(Julius.setLocation(table));
        System.out.println(Malish.getName()+Malish.think(":\"Все сидят вместе и обсуждают события прошлой ночи, и всем так уютно\""));
        Karlson.setMood(Mood.PLEASED);
        System.out.println(Karlson.getName()+Karlson.showMood()+ " и " + Karlson.praise(Frekenbok));


    }
}