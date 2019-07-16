import ru.ifmo.se.pokemon.*;
public class Whirlipede extends Venipede {
    public Whirlipede(String name, int level) {
        super(name, level);
        setType(Type.BUG,Type.POISON);
        setStats(40D, 55D, 99D, 40D, 79D, 47D);
        setMove(new Rest(),new Confide(),new Splash());
    }
}
