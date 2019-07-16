import ru.ifmo.se.pokemon.*;
public class BulkUp extends StatusMove {
    public BulkUp(){
        super(Type.FIGHTING,0,0);
    }
    @Override
    protected java.lang.String describe() {
        return "Bulks up the body to boost DEFENSE";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(1).stat(Stat.DEFENSE,1);
    }
}
