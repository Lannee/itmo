package Moves;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove{
    public Roost(){
        super(Type.FLYING, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        double fullHP = pokemon.getStat(Stat.HP);
        double currentHP = pokemon.getHP();

        Effect healing = new Effect().turns(-1);
        if(currentHP < fullHP / 2) {
            healing = healing.stat(Stat.HP, (int)(currentHP + fullHP / 2));
        }
        else {
            healing = healing.stat(Stat.HP, (int)fullHP);
        }
        pokemon.addEffect(healing);
    }

    protected java.lang.String describe() {
        return "использовал способность Roost";
    }
}
