package Controller;

import Model.Repo.Library;
import View.GUI;

public class Controller {
    Library library = new Library();
    GUI gui = new GUI();

    public void start(){
        gui.mostrarInicio();

    }
    public void play(){
        switch (gui.mostrarMenuPrincipal()){
            case 1:
                gui.switchList();
                    if (gui.switchList()==1){
                        library.listarFavorito(gui.leeString("Dame el nombre de tu favorito"));
                    }else if (gui.switchList()==2)
                        library.listarFavoritos();
                break;
            case 2:
              library.añadirFavorito(gui.mostrarAñadirBorrarFavorito(gui.mostrarMenuFavoritos()));
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

        }


    }
}
