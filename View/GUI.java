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
        boolean aux = false;
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print(msg + ": ");
            try {
                numero = teclado.nextInt();
                aux = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Introduce un número válido.");
                teclado.next();
            }
        } while (!aux);

        return numero;
    }

    @Override
    public String leeString(String msg) {
        String entrada = "";
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print(msg + ": ");
            try {
                entrada = teclado.nextLine();
            } catch (Exception e) {
                teclado.next();
            }
        } while (entrada.isEmpty());

        return entrada;
    }


    @Override
    public Favs mostrarAñadirFavorito(int opcion) {
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
