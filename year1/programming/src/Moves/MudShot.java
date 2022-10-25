package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class MudShot extends SpecialMove {
    public MudShot() {
        super(Type.GROUND, 55, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(p.getStat(Stat.SPEED) > -6) {
            p.setMod(Stat.EVASION, -1);
        }
    }

    @Override
    protected String describe() {
        return "использовал атаку Mud Shot";
    }
}
