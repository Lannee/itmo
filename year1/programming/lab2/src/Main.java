import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Tropius("Гусеничка", 51));
        b.addAlly(new Poliwhirl("Крутыш", 95));
        b.addAlly(new Poliwrath("Биг-Босс", 95));


        b.addFoe(new Poliwag("Криветка", 21));
        b.addFoe(new Vullaby("Птичка", 53));
        b.addFoe(new Mandibuzz("Сокол", 53));
        b.go();
    }
}