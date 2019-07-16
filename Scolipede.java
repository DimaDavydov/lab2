import ru.ifmo.se.pokemon.*;
public class Scolipede extends Whirlipede {
    public Scolipede(String name, int level) {
        super(name, level);
        setType(Type.BUG,Type.POISON);
        setStats(60D, 100D, 89D, 55D, 69D, 112D);
        setMove(new Rest(),new Confide(),new Splash(),new DoubleTeam());
    }
}
