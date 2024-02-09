package Model.Repo;

import Interface.ILibrary;
import Model.Entity.Favs;

import java.util.Arrays;

public class Library implements ILibrary {
    private Favs[] favs;
    private static final int Tam = 10;


    public Library() {
        favs = new Favs[Tam];

    }

    @Override
    public void listarFavorito(String nombre) {
        for (int i = 0; i < favs.length; i++) {
            if (favs[i].getName().equals(nombre)) {
                System.out.println(favs[i].toString());
            }
        }
    }

    @Override
    public void listarFavoritos() {
        for (int i = 0; i < favs.length; i++) {
                System.out.println(favs[i].toString());
            }
        }

    private int getPosFav(Favs fav) {
        int result = -1;
        for (int i = 0; i < favs.length; i++) {
            if (favs[i] != null && favs[i].equals(fav)) {
                result = i;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean añadirFavorito(Favs fav) {

        boolean result = false;
        if (getPosFav(fav) == -1) {
            for (int i = 0; i < favs.length; i++) {
                if (favs[i] == null) {
                    favs[i] = fav;
                    result = true;
                    if (result==true){
                        System.out.println("Tu favorito ha sido añadido");
                        break;
                    }
                }
            }
        }
        return result;
    }

    @Override
    public boolean borrarFavorito(Favs fav) {
        boolean result = false;
        if (getPosFav(fav) != -1) {
            for (int i = 0; i < favs.length; i++) {
                if (favs[i].equals(fav)) {
                    favs[i] = null;
                    result = true;
                    if (result==true){
                        System.out.println("Tu favorito ha sido borrado");
                        break;
                    }
                }
            }
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
