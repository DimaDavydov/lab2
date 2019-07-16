import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Shuckle("Shuckle",1));
        battle.addAlly(new Persian("Persian",1));
        battle.addAlly(new Whirlipede("Whirlipede",1));
        battle.addFoe(new Meowth("Meowth",1));
        battle.addFoe(new Venipede("Venipede",1));
        battle.addFoe(new Scolipede("Scolipede",1));
        battle.go();
    }
}
