package View;

import Interface.IGUI;
import Model.Entity.Favs;
import Model.Entity.Game;
import Model.Entity.Movie;
import Model.Entity.Song;

import java.util.Scanner;

public class GUI implements IGUI {
    @Override
    public void mostrarInicio() {
        System.out.println("*******************************************");
        System.out.println("*                                         *");
        System.out.println("*            Lista de favoritos           *");
        System.out.println("*                                         *");
        System.out.println("*******************************************");
    }

    @Override
    public int switchList() {

        System.out.println("1. Listar favoritos ");
        System.out.println("2. Listar todos ");
        int opcion =leeNumero("¿Que desea hacer?");

        return opcion;
        }



    @Override
    public int mostrarMenuPrincipal() {
        System.out.println("----------------------------------");
        System.out.println("|       1.Listar favoritos       |");
        System.out.println("|      2.Insertar favoritos      |");
        System.out.println("|     3.Actualizar favoritos     |");
        System.out.println("|       4.Borrar favoritos       |");
        System.out.println("|             5.Salir            |");
        System.out.println("----------------------------------");
        int opcion = leeNumero("Inserte una opción");
        return opcion;
    }

    @Override
    public int mostrarMenuFavoritos() {
        System.out.println("----------------------------------");
        System.out.println("|           1.Juegos             |");
        System.out.println("|          2.Películas           |");
        System.out.println("|          3.Canciones           |");
        System.out.println("----------------------------------");
        int opcion = leeNumero("Inserte una opción");
        return opcion;
    }

    @Override
    public int leeNumero(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(msg + ": ");
        return teclado.nextInt();

    }

    @Override
    public String leeString(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(msg + ": ");
        return teclado.nextLine();

    }

    @Override
    public Favs mostrarAñadirBorrarFavorito(int opcion) {
        Favs result;


        switch (opcion) {
            case 1:
                result = new Game("", "", 0);
                break;
            case 2:
                result = new Movie("", "", "");
                break;
            default:
                result = new Song("", "", "");
        }
        result.setName(leeString("Inserte el nombre del favorito"));
        result.setID(leeString("Inserte el ID "));
        if (opcion == 1) {
            ((Game) result).setPrice(leeNumero("Inserte el precio de su juego"));

        } else if (opcion == 2) {
            ((Movie) result).setGender(leeString("Inserte el género de la película"));
        } else {
            ((Song) result).setArtist(leeString("Inserte el artista de la canción"));
        }
        return result;

    }


}
