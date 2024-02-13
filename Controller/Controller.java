package Controller;

import Interface.IController;
import Model.Repo.Library;
import Persistence.Serializator;
import View.GUI;

public class Controller implements IController {
    Library library=new Library();
    GUI gui = new GUI();
    public static Library load;

    public void start() {

        if(load==null) {
            load=Serializator.deserializer("CARGADOS.bin");
            if (load!=null){
                library=load;
                System.out.println("Datos cargados");
            }
        }
        gui.mostrarInicio();

    }

    public void play() {
        int opcion;
        int opcionSwitchlist;

        do {
            opcion = gui.mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    opcionSwitchlist = gui.switchList();
                    if (opcionSwitchlist == 1) {
                        library.listarFavorito(gui.leeString("Dame el nombre de tu favorito"));
                    } else if (opcionSwitchlist == 2) {
                        library.listarFavoritos();

                    }
                    break;
                case 2:
                    library.añadirFavorito(gui.mostrarAñadirFavorito(gui.mostrarMenuFavoritos()));
                    Serializator.serialize(library, "CARGADOS.bin");


                    break;
                case 3:
                    library.actualizarFavorito(gui.leeString("Dame el nombre del favorito para actualizar"));
                    Serializator.serialize(library, "CARGADOS.bin");

                    break;
                case 4:
                    library.borrarFavorito(gui.leeString("Dame tu ID"));
                    Serializator.serialize(library, "CARGADOS.bin");

                    break;
                case 5:
                    break;
            }
        }
        while (opcion != 5);
    }
}