import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Tropius("Гусеничка", 50));
        b.addAlly(new Poliwhirl("Крутыш", 50));
        b.addAlly(new Poliwrath("Биг-Босс", 50));


        b.addFoe(new Poliwag("Криветка", 50));
        b.addFoe(new Vullaby("Птичка", 50));
        b.addFoe(new Mandibuzz("Сокол", 50));
        b.go();
    }
}