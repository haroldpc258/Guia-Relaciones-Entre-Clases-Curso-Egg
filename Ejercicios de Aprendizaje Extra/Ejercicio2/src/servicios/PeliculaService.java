package servicios;

import entidades.Pelicula;

import java.util.Scanner;

public class PeliculaService {

    public Pelicula crearPelicula(Scanner scanner) {

        Pelicula nuevaPelicula = new Pelicula();
        System.out.println("\nINFORMACIÓN DE LA PELÍCULA...");

        System.out.print("Ingrese el título: ");
        nuevaPelicula.setTitulo(scanner.next());

        System.out.print("Ingrese el nombre del director: ");
        nuevaPelicula.setDirector(scanner.next());

        System.out.print("Ingrese la duración: ");
        nuevaPelicula.setDuracion(scanner.nextInt());

        System.out.print("Ingrese la edad mínima de ingreso: ");
        nuevaPelicula.setEdadMinima(scanner.nextInt());

        return nuevaPelicula;
    }
}
