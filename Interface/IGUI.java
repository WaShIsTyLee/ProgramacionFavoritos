package Interface;

import Model.Entity.Favs;

public interface IGUI {
    void mostrarInicio();
    int switchList();
    int mostrarMenuPrincipal();
    int mostrarMenuFavoritos();
    int leeNumero(String msg);
    String leeString(String msg);
    Favs mostrarAñadirBorrarFavorito(int opcion);

}
