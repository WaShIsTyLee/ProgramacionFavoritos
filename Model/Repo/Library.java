package Model.Repo;

import Interface.ILibrary;
import Model.Entity.Favs;
import View.GUI;

import java.util.Arrays;

public class Library implements ILibrary {
    GUI gui = new GUI();
    private Favs[] favs;
    private static final int Tam = 10;


    public Library() {
        favs = new Favs[Tam];
    }

    @Override
    public void listarFavorito(String nombre) {
        for (int i = 0; i < this.favs.length; i++) {
            if (this.favs[i] != null && this.favs[i].getName().equals(nombre)) {
                System.out.println(this.favs[i].toString());
            }
        }
    }

    @Override
    public void listarFavoritos() {
        for (int i = 0; i < this.favs.length; i++) {
            if (this.favs[i] != null) {
                System.out.println(this.favs[i].toString());
            }
        }
    }

    @Override
    public boolean actualizarFavorito(String nombre) {
        for (int i = 0; i < favs.length; i++) {
            if (favs[i] != null && favs[i].getName().equals(nombre)) {
                favs[i].setName(gui.leeString("Cambiale el nombre a tu favorito"));
            }
        }
        return true;
    }


    private int isFav(Favs fav) {
        int result = -1;
        boolean found = false;
        for (int i = 0; i < favs.length && !found; i++) {
            if (favs[i] != null && favs[i].equals(fav)) {
                result = i;
                found = true;
            }
        }
        return result;
    }

    @Override
    public boolean añadirFavorito(Favs fav) {
        boolean result = false;
        if (isFav(fav) == -1) {
            boolean added = false;
            for (int i = 0; i < favs.length && !added; i++) {
                if (favs[i] == null) {
                    favs[i] = fav;
                    result = true;
                    added = true;
                }
            }
            if (result) {
                System.out.println("Tu favorito ha sido añadido");
            }
        }
        return result;
    }


    @Override
    public boolean borrarFavorito(String ID) {
        boolean result = false;
        for (int i = 0; i < favs.length; i++) {
            if (favs[i] != null && favs[i].getID().equals(ID)) {
                favs[i] = null;
                result = true;
            }
        }
        if (result) {
            System.out.println("Tu favorito ha sido borrado");
        }
        return result;
    }



    @Override
    public String toString() {
        return "Library{" +
                "favs=" + Arrays.toString(favs) +
                '}';
    }
}