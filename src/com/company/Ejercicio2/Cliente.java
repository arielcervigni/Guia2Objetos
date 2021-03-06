package com.company.Ejercicio2;

import java.util.Scanner;
import java.util.UUID;

public class Cliente {

    private UUID ID;
    private String nombre;
    private String email;
    private double descuento;

    /// Constructor
    public Cliente () {
        Scanner bf = new Scanner(System.in);
        String teclado;
        double desc;

        setID();
        System.out.print("Ingrese su nombre y apellido\t");
        teclado = bf.nextLine();
        setNombre(teclado);
        System.out.print("Ingrese su email\t");
        teclado = bf.nextLine();
        setEmail(teclado);
        System.out.print("Ingrese su porcentaje de descuento %\t");
        desc = bf.nextDouble();
        setDescuento(desc);
    }
    /// GETTERS
    public UUID getID() {
        return ID;
    }
    public String getNombre ()
    {
        return nombre;
    }
    public String getEmail()
    {
        return email;
    }
    public double getDescuento()
    {
        return descuento;
    }
    /// SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setDescuento(double desc)
    {
        this.descuento = desc;
    }
    public void setID ()
    {
        this.ID = UUID.randomUUID();
    }

    public void mostrarCliente ()
    {
        System.out.println("//////////////////////////////////////////");
        System.out.println("ID Cliente: " + this.ID);
        System.out.println("Nombre y Apellido: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Descuento: % " + this.descuento);
        System.out.println("//////////////////////////////////////////");
    }
}
