package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Snarl extends SpecialMove {

    public Snarl() {
        super(Type.DARK, 55, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1 );
    }

    @Override
    protected String describe() {
        return "использовал атаку Snarl. Понизил специальную атаку противника на 1 степень";
    }
}
