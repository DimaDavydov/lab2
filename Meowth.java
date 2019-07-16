import ru.ifmo.se.pokemon.*;
public class Meowth extends Pokemon {
    public Meowth(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(40D, 45D, 35D, 40D, 40D, 90D);
        setMove(new Facade(),new Rest(),new AerialAce());
    }
}
