package com.company.Ejercicio3;

import java.util.Scanner;
import java.util.UUID;

public class ClienteBanco {

    private UUID ID = new UUID();
    private char genero;
    private String nombre;

    public ClienteBanco (String name, char gen)
    {
        this.ID = UUID.randomUUID();
        setNombre(name);
        setGenero(gen);
    }
    public ClienteBanco ()
    {
        Scanner bf = new Scanner(System.in);

        System.out.println("Bienvenido al banco: AJC");
        this.ID = UUID.randomUUID();
        System.out.print("Ingrese su nombre para crear una cuenta: \t");
        setNombre(bf.nextLine());
        System.out.print("Ingrese su genero: \t");
        setGenero(bf.next().charAt(0));
    }

    public ClienteBanco ()
    {
        Scanner bf = new Scanner(System.in);
        this.ID = UUID.randomUUID();
        this.nombre = bf.nextLine();
        this.genero = bf.next().charAt(0);
    }
    public (ClienteBnaco (String name, char genero)
    {

    }

    public UUID getID() {
        return ID;
    }
    public char getGenero() { return genero; }
    public String getNombre() { return nombre; }

    public void setID (){
        this.ID = ID;
    }
    public void setGenero (char gen)
    {
        this.genero = gen;
    }
    public void setNombre (String name) { this.nombre = name; }

    public void mostrarCliente ()
    {
        System.out.println("//////////////////////////////////////");
        System.out.println("ID Cliente: " + this.ID);
        System.out.println("Nombre y Apellido: " + this.nombre);
        System.out.println("Género: " + this.genero);
        System.out.println("//////////////////////////////////////");
    }
}