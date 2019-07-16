import ru.ifmo.se.pokemon.*;
public class Persian extends Meowth {
    public Persian(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(65D, 70D, 60D, 65D, 65D, 115D);
        setMove(new Facade(),new Rest(),new AerialAce(),new Slash());
    }
}
