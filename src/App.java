import java.util.ArrayList;
import java.util.List;

import Montros.Monstros;
import Personagens.Personagens;

public class App {
    public static void main(String[] args) throws Exception {
    List<Monstros> pokemon = new ArrayList<>();
    List<Personagens> treinador = new ArrayList<>();

    Personagens treiner = new Personagens();
    Monstros no1 = new Monstros();
    Monstros no2 = new Monstros();

    treiner.setNome("Spark");
    treiner.setAtaque(2);
    treiner.setDefesa(3);

    no1.setNomeMonstros("javai");
    no1.setDefesa(12);
    no1.setForca(15);
    no2.setNomeMonstros("ji");
    no2.setDefesa(14);
    no2.setForca(7);
    pokemon.add(no1);
    pokemon.add(no2);
    System.out.println(treiner);
    System.out.println(pokemon);




    }

}
