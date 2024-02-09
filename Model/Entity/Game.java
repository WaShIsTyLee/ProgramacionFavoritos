package Model.Entity;

import java.util.Objects;

public class Game extends Favs {
    private float price;

    public Game(String name, String ID, float price) {
        super(name, ID);
        this.price = price;
    }
    public Game(){
        this(0);
    }

    public Game(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Juego: " + "\n" +
                "Precio: " + price + "\n" +
                "Nombre: " + name + "\n" +
                "ID: " + ID + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game game)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(getPrice(), game.getPrice()) == 0;
    }


}
