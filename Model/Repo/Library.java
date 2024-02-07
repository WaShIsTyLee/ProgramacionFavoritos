package Model.Repo;

import Interface.ILibrary;
import Model.Entity.Favs;

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
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public boolean borrarFavorito(Favs fav) {
        boolean result = false;
        int pos = getPosFav(fav);
        if (pos != -1) {
            favs[pos] = null;
            result = true;
        }
        return result;
    }
}
