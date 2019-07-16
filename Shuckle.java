import ru.ifmo.se.pokemon.*;
public class Shuckle extends Pokemon {
    public Shuckle(String name, int level) {
        super(name, level);
        setType(Type.BUG,Type.ROCK);
        setStats(20D, 10D, 230D, 10D, 230D, 5D);
        setMove(new FocusEnergy(),new KarateChop(),new Confide(),new BulkUp());
    }
}
