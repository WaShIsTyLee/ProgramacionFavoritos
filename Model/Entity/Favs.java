package Model.Entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Favs implements Serializable {
    protected String name;
    protected String ID;

    public Favs(String name, String ID) {
        this.name = name;
        this.ID = generateRandomID();
    }
    public Favs(){
        this("","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Favs favs)) return false;
        return Objects.equals(getName(), favs.getName()) && Objects.equals(getID(), favs.getID());
    }

    /**
     * Funcion que crea aleatoriamente una ID
     * @return ID
     */
    private String generateRandomID() {
        int randomNumber = new Random().nextInt(9000) + 1000;
        char randomLetter = (char) ('A' + new Random().nextInt(26));
        return String.format("%d%c", randomNumber, randomLetter);
    }

    @Override
    public String toString() {
        return "Tu favorito: " +
                "NOMBRE---> "+name + '\'' +
                "ID---> " + ID + '\'';
    }
}
