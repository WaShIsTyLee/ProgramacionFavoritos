package Interface;

import Model.Entity.Favs;

public interface ILibrary {
    void listarFavorito(String nombre);
    void listarFavoritos();
    boolean actualizarFavorito(String nombre);
    boolean añadirFavorito(Favs fav);
    boolean borrarFavorito(String ID);
}
