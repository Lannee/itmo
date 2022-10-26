package Moves;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if(p.getStat(Stat.EVASION) < 6) {
            p.setMod(Stat.EVASION, 1);
        }
    }

    @Override
    protected String describe() {
        return "использовал способность Double Team";
    }
}
