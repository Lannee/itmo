package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Moves.*;

public class Vullaby extends Pokemon {

    public Vullaby() { super();}
    public Vullaby(String name, int level) {
        super(name, level);
        this.addType(Type.FLYING);
        this.addType(Type.DARK);
        this.setStats(70, 55, 75, 45, 65, 60);

        this.addMove(new Snarl());
        this.addMove(new DoubleTeam());
        this.addMove(new AerialAce());
    }

}
