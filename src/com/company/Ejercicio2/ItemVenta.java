package com.company.Ejercicio2;

import java.util.Scanner;
import java.util.UUID;

public class ItemVenta {

    private UUID ID;
    private String nombre;
    private String descripcion;
    private double precioUnitario;
    private int cantidadItem;
    private double precioTotal;

    /// Constructor
    public ItemVenta ()
    {
        Scanner bf = new Scanner(System.in);
        setID();
        System.out.print("Ingrese el nombre del producto:\t");
        this.nombre = bf.nextLine();
        System.out.print("Ingrese la descripción del producto:\t");
        this.descripcion = bf.nextLine();
        System.out.print("Ingrese el precio unitario del producto:\t");
        this.precioUnitario = bf.nextDouble();
        System.out.print("Ingrese la cantidad del producto:\t");
        this.cantidadItem = bf.nextInt();
        this.precioTotal = totalItem();
    }

    /// GETTERS
    public UUID getID() {
        return ID;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public int getCantidadProducto () { return cantidadItem; }
    public String getDescripcion() { return descripcion; }
    public double getPrecioTotal() { return precioTotal; }

    /// SETTERS
    public void setID ()
    {
        ID = UUID.randomUUID();
        this.ID = ID;
    }
    public void setNombre()
    {
        this.nombre = nombre;
    }
    public void setDescripcion () { this.descripcion = descripcion; }
    public void setPrecioUnitario()
    {
        this.precioUnitario = precioUnitario;
    }
    public void setCantidadProducto() { this.cantidadItem = cantidadItem; }
    public void setPrecioTotal() {this.precioTotal = precioTotal;}

    public void mostrarItem ()
    {
        System.out.println("--------------------------------------");
        System.out.println("ID Item: " + this.ID);
        System.out.println("Nombre Item: " + this.nombre);
        System.out.println("Descripción Item: " + this.descripcion);
        System.out.println("Cantidad Item: " + this.cantidadItem);
        System.out.println("Precio Unitario: " + this.precioUnitario);
        System.out.println("Precio Total: " + this.precioTotal);
        System.out.println("--------------------------------------");
    }
    public double totalItem ()
    {
        double rta = 0;
        rta = this.precioUnitario*this.cantidadItem;
        return rta;
    }


}


