package com.company.Ejercicio1;

import java.util.Scanner;

public class Autor
{
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    /// Constructor
    // public Autor(String nombre, String apellido, String email, char genero)

    public Autor (String nombre, String apellido, String email, char genero)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public Autor ()
    {
        Scanner bf = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Autor:");
        this.nombre = bf.nextLine();
        System.out.println("Ingrese el apellido del Autor:");
        this.apellido = bf.nextLine();
        System.out.println("Ingrese el email del Autor:");
        this.email = bf.nextLine();
        System.out.println("Ingrese el genero del Autor:");
        this.genero = bf.next().charAt(0);
    }


    public int ADA (Autor ADA [])
    {
        char control = 's';
        int posAutor = 0;
        Scanner bf = new Scanner (System.in);

        while (control =='s' && posAutor < 5)
        {
            ADA[posAutor] = new Autor();
            System.out.print("Desea agregar otro autor? s/n");
            control = bf.next().charAt(0);
            posAutor ++;
        }
        return posAutor;
    }
    /// get autor

    public String getNombre()
    {
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getEmail() { return email; }
    public char getGenero () { return genero; }

    /// set autor

    public void setNombre(String name)
    {
        this.nombre = name;
    }
    public void setApellido (String sName)
    {
        this.apellido = sName;
    }
    public void setEmail(String mail)
    {
        this.email = mail;
    }
    public void setGenero (char g)
    {
        this.genero = g;
    }

    /// Metodos
    public void mostrarAutor ()
    {
        System.out.println("------------- Autor: ------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Genero: " + this.genero);
        System.out.println("---------------------------------");
    }





}
