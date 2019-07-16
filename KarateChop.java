import ru.ifmo.se.pokemon.*;
public class KarateChop extends PhysicalMove {
    public KarateChop(){
        super(Type.FIGHTING,50,1);
    }
    @Override
    protected java.lang.String describe() {
        return "The target is attacked with a sharp chop";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(1).stat(Stat.HP, -1);
        p.addEffect(e);
    }
}
