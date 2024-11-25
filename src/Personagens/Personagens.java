package Personagens;

public class Personagens {
    String nome;
    int ataque;
    int defesa;
    int agilidades;
    @Override
    public String toString() {
        return "Personagens [getNome()=" + getNome() + ", getAtaque()=" + getAtaque() + ", getDefesa()=" + getDefesa()
                + ", getAgilidades()=" + getAgilidades() + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getAgilidades() {
        return agilidades;
    }
    public void setAgilidades(int agilidades) {
        this.agilidades = agilidades;
    }
    
}
