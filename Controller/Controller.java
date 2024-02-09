package Controller;

import Model.Repo.Library;
import View.GUI;

public class Controller {
    Library library = new Library();
    GUI gui = new GUI();

    public void start() {
        gui.mostrarInicio();

    }

    public void play() {
        int opcion;
        int opcionSwitchlist;
        do {
            opcion = gui.mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    opcionSwitchlist=gui.switchList();
                    if (opcionSwitchlist == 1) {
                        library.listarFavorito(gui.leeString("Dame el nombre de tu favorito"));
                    } else if (opcionSwitchlist == 2) {
                        library.listarFavoritos();
                    }
                    break;
                case 2:
                    library.añadirFavorito(gui.mostrarAñadirBorrarFavorito(gui.mostrarMenuFavoritos()));
                    break;
                case 3:

                    break;
                case 4:
                    library.borrarFavorito(gui.mostrarAñadirBorrarFavorito(gui.mostrarMenuFavoritos()));
                    break;
                case 5:
                    break;


            }
        }
        while (opcion != 5);
    }
}
