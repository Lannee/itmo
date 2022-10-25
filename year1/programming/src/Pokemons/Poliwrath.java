package Pokemons;

import Moves.Hypnosis;
import ru.ifmo.se.pokemon.Type;

public class Poliwrath extends Poliwhirl {
    public Poliwrath(String name, int level) {
        super(name, level);
        this.addType(Type.FIGHTING);

        this.setStats(90, 95, 95, 70, 90, 70);

        this.addMove(new Hypnosis());
    }

}
