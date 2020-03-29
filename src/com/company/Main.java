package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ejercicio1();
    }

    static public void ejercicio1()
    {
        /*
        /// Ejercicio A
        Autor unAutor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        /// Ejercicio B
        unAutor.mostrarAutor(unAutor);
        /// Ejercicio C
        Libro unLibro = new Libro("Effective Java", "Joshua Bloch", 450, 150);
        /// Ejercicio D
        unLibro.mostrarLibro ();
        /// Ejercicio E
        unLibro.setPrecio(500);
        unLibro.setStock(150+50);
        /// Ejercicio F
        unLibro.mostrarLibroConAutor (unLibro,unAutor);
        /// Ejercicio G
        unLibro.mostrarLibroAutorYPrecio ();
        /// Ejercicio H
        Libro libroConDosAutores;
        libroConDosAutores = new Libro ("Prueba de Java", "Joshua Bloch", "Ariel Cervigni", 450, 150);
        Autor otroAutor = new Autor("Ariel", "Cervigni", "arielcervigni@gmail.com", 'M');

        System.out.println("PRUEBA:");
        unLibro.mostrarLibroAutoresYPrecio2();

        libroConDosAutores.mostrarLibroAutoresYPrecio2();

         */
        Libro unLibro = new Libro("Prueba", "Ariel", 500, 400);
        char control = 's';
        Autor unAutor = new Autor(null, null, null, '\n');
        Autor ADA [] = new Autor[5];
        System.out.println("Aca");
        int posAutor = unAutor.ADA(ADA);

        unLibro.mostrarLibroConADA(unLibro, ADA, posAutor);
    }
}
