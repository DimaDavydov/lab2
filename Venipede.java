import ru.ifmo.se.pokemon.*;
public class Venipede extends Pokemon {
    public Venipede(String name, int level) {
        super(name, level);
        setType(Type.BUG,Type.POISON);
        setStats(30D, 45D, 59D, 30D, 39D, 57D);
        setMove(new Rest(),new Confide());
    }
}

