import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0,0);
    }
    @Override
    protected java.lang.String describe() {
        return "Heightens target's evasiveness";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(1).stat(Stat.EVASION, 1);
        p.addEffect(e);
    }
}