package com.company;

public class Autor
{
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    /// Constructor
    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
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
    public void mostrarAutor (Autor unAutor)
    {
        System.out.println("------------- Autor: ------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Genero: " + this.genero);
        System.out.println("---------------------------------");
    }

}
