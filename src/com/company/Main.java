package com.company;

import com.company.Ejercicio1.Autor;
import com.company.Ejercicio1.Libro;
import com.company.Ejercicio2.Cliente;
import com.company.Ejercicio2.Factura;
import com.company.Ejercicio3.ClienteBanco;
import com.company.Ejercicio3.Cuenta;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ejercicio2();
    }

    static public void ejercicio1()
    {

        /// Ejercicio A
        Autor unAutor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        /// Ejercicio B
        unAutor.mostrarAutor();
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

        Libro unLibro2 = new Libro("Prueba", "Ariel", 500, 400);
        Autor unAutor2 = new Autor(null, null, null, '\n');
        Autor ADA [] = new Autor[5];
        int posAutor = unAutor2.ADA(ADA);
        unLibro2.mostrarLibroConADA(unLibro, ADA, posAutor);


    }
    static public void ejercicio2()
    {
        Cliente unCliente = new Cliente();
        Factura unaFactura = new Factura(unCliente);
        unaFactura.mostrarTodo();
    }
    static public void ejercicio3() {

        Cuenta unaCuenta = new Cuenta();
        unaCuenta.mostrarCuenta();
        unaCuenta.mostrarMovimientos();
    }
}
