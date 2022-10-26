package Pokemons;

import Moves.BoneRush;

public class Mandibuzz extends Vullaby {
    public Mandibuzz(String name, int level) {
        super(name, level);
        this.setStats(110, 65, 105,55,95, 80);

        this.addMove(new BoneRush());
    }
}
