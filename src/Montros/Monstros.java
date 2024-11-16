package Montros;

import java.util.ArrayList;
import java.util.List;



public class Monstros {
    //monstros tem nome
    //monstros tem atacks
    //monstros tem defesas
    //monstros tem agilidades
    private List<String> nomeCriatura = new ArrayList<>();

    public List<String> getNomeCriatura() {
        return nomeCriatura;
    }

    public void setNomeCriatura(List<String> nomeCriatura) {
        this.nomeCriatura = nomeCriatura;
    }

    public void adicionarCriatura(String nome ){
        this.nomeCriatura.add(nome);
    }

    @Override
    public String toString() {
        return "Monstros [nomeCriatura=" + nomeCriatura + "]";
    }
    
}
