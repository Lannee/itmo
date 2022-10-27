package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DoubleSlap extends PhysicalMove {
    public DoubleSlap() {
        super(Type.NORMAL, 15, 85);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        float[] chances = { 1, 3f/8f, 3f/8f, 1f/8f, 1f/8f};
        int[] powers = {(int)damage, 30, 45, 60, 75};
        for(int i = 0; i < chances.length; i++) {
            if(Math.random() > chances[i]) {
                break;
            }
            p.setMod(Stat.HP, Math.round(powers[i]));
        }
    }

    @Override
    protected String describe() {
        return "использовал атаку Double Slap";
    }
}
