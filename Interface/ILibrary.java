package Interface;

import Model.Entity.Favs;

public interface ILibrary {
    void listarFavorito(String nombre);
    void listarFavoritos();
    boolean añadirFavorito(Favs fav);
    boolean borrarFavorito(Favs fav);
}
