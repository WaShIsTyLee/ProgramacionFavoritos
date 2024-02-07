package Interface;

import Model.Entity.Favs;

public interface IGUI {
    void mostrarInicio();
    void mostrarMenuPrincipal();
    int mostrarMenuFavoritos();
    int leeNumero();
    String leeString();
    Favs mostrarAñadirBorrarFavorito();

}
