package Model.Entity;

import java.util.Objects;

public class Favs {
    protected String name;
    protected String ID;

    public Favs(String name, String ID) {
        this.name = name;
        this.ID = ID;
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

    @Override
    public String toString() {
        return "Favs{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
