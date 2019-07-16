import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
    public  Confide(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected java.lang.String describe() {
        return "Lowers target's ability to concentrate!";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(1).stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(e);
    }
}
