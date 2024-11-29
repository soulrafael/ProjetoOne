package MapaWorld;


public class Mundos {
private String mundo;

@Override
public String toString() {
    return "Mundos [mundo=" + getMundo() + "]";
}

public String getMundo() {
    return mundo;
}

public void setMundo(String mundo) {
    this.mundo = mundo;
}

    
}
