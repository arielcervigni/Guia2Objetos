package com.company;

public class Libro {

    private String titulo;
    private double precio;
    private int stock;
    private String autor;
    private String autor2;

    /// Constructor
    public Libro (String titulo, String autor, double precio, int stock)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }
    /// Constructor con mas de un autor
    public Libro (String titulo, String autor, String autor2, double precio, int stock)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.autor2 = autor2;
        this.precio = precio;
        this.stock = stock;
    }
    /// get libro
    public String getTitulo()
    {
        return titulo;
    }
    public String getAutor () { return autor; }
    public String getAutor2 () { return autor2; }
    public double getPrecio () { return precio; }
    public int getStock () { return stock; }

    /// set libro
    public void setTitulo(String title) {
        this.titulo = title;
    }
    public void setAutor (String aut) { this.autor = aut; }
    public void setAutor2 (String aut2) { this.autor2 = aut2; }
    public void setPrecio (double price) { this.precio = price; }
    public void setStock (int cant) { this.stock = cant; }

    public void mostrarLibro ()
    {
        System.out.println("---------------------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Stock: " + this.stock);
        System.out.println("Precio: $" + this.precio);
        System.out.println("---------------------------------");
    }
    public void mostrarLibroConAutor (Libro unLibro, Autor unAutor)
    {
        System.out.println("---------------------------------");
        System.out.println("Titulo: " + this.titulo);
        unAutor.mostrarAutor(unAutor);
        System.out.println("Stock: " + this.stock);
        System.out.println("Precio: $" + this.precio);
        System.out.println("---------------------------------");
    }
    public void mostrarLibroAutorYPrecio ()
    {
        System.out.println("El libro " + this.titulo +" de " + this.autor +". Se vende a: " + this.precio + " pesos.");
    }
    public void mostrarLibroAutoresYPrecio ()
    {
        System.out.println("El libro " + this.titulo +" de " + this.autor +". Y " + this.autor2 + ". Se vende a: " + this.precio + " pesos.");
    }
    public void mostrarLibroAutoresYPrecio2 ()
    {
      System.out.print("El libro " + this.titulo + " de " + this.autor);
      if (this.autor2 != null)
          System.out.print(" Y " + this.autor2);
      System.out.print (". Se vende a: " + this.precio + "\n");
    }
}
