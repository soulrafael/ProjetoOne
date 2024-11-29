import java.util.ArrayList;
import java.util.List;


import MapaWorld.Mundos;
import Montros.Monstros;
import Personagens.Personagens;

public class App {
    public static void main(String[] args) throws Exception {
    List<Monstros> pokemon = new ArrayList<>();
    List<Mundos> mundos = new ArrayList<>();
    Mundos fase1 = new Mundos();
    fase1.setMundo("nulffl");
    mundos.add(fase1);
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
while (no1.getDefesa()>treiner.getDefesa()) {
if (no1.getDefesa()>treiner.getDefesa()) {
    int atk = treiner.getAtaque();
    int def = no1.getDefesa();
   int result = def - atk;
    no1.setDefesa(result);
    System.out.println(no1.getDefesa());
}
pokemon.remove(no1);
}
System.out.println(pokemon);
 
    
}
public void xp()
{ }
    }



