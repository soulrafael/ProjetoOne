 package Montros;

public class Monstros {
 private String nomeMonstros;
 private int forca;
 private int defesa;
@Override
public String toString() {
    return "Monstros [nomeMonstros=" + nomeMonstros + ", forca=" + forca + ", defesa=" + defesa + "]";
}
public Monstros(String nomeMonstros, int forca, int defesa) {
    this.nomeMonstros = nomeMonstros;
    this.forca = forca;
    this.defesa = defesa;
}
public Monstros() {
    //TODO Auto-generated constructor stub
}
public String getNomeMonstros() {
    return nomeMonstros;
}
public void setNomeMonstros(String nomeMonstros) {
    this.nomeMonstros = nomeMonstros;
}
public int getForca() {
    return forca;
}
public void setForca(int forca) {
    this.forca = forca;
}
public int getDefesa() {
    return defesa;
}
public void setDefesa(int defesa) {
    this.defesa = defesa;
}
    
}