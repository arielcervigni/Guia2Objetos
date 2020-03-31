package com.company.Ejercicio2;
import java.net.IDN;
import java.time.*;
import java.util.Formatter;
import java.util.Scanner;
import java.util.UUID;

public class Factura<total, descuento> {

    UUID ID;
    double total;
    LocalDateTime fyh;
    Cliente unCliente;
    ItemVenta ADIV[];
    int dimension;
    int cantidad;

    public Factura (Cliente unCliente, int dim, int cant)
    {
        setID();
        setFyh();
        this.unCliente = unCliente;
        this.dimension = dim;
        this.cantidad = cargarItems();
        ItemVenta ADIV[] = null;
        this.total = sumarItems();
    }

    public UUID getID()
    {
        return ID;
    }
    public double getTotal ()
    {
        return total;
    }
    public LocalDateTime getFyh ()
    {
        return fyh;
    }
    public Cliente getUnCliente()
    {
        return unCliente;
    }
    public int getDimension () { return dimension; }
    public int getCantidad () { return cantidad; }
    public ItemVenta[] getADIV () { return ADIV; }

    public void setTotal ()
    {
        this.total = sumarItems();
    }
    public void setCliente (Cliente unCliente)
    {
        this.unCliente = unCliente;
    }
    public void setID ()
    {
        UUID ID = UUID.randomUUID();
        this.ID = ID;
    }
    public void setFyh ()
    {
        LocalDateTime fyh = LocalDateTime.now();
        this.fyh = fyh;
    }
    public void setADIV(ItemVenta[] ADIV) {
        this.ADIV = ADIV;
    }
    public void setDimension ()  {this.dimension = dimension; }
    public void setCantidad ()  {this.cantidad = cantidad; }

    public void mostrarFactura ()
    {
        System.out.println("ID Factura: " + ID);
        unCliente.mostrarCliente();
        System.out.println("Fecha y hora: " + fyh);
        System.out.println("Total: " + total);
    }
    public double calcularTotal (Cliente unCliente)
    {
       double totalConDescuento = 0;
       double descuento = 0;
       double porcentaje = unCliente.getDescuento();

       descuento = (porcentaje*this.total)/100;
       totalConDescuento = this.total - descuento;

        return totalConDescuento;
    }
    public void mostrarTodo (Cliente unCliente)
    {
        unCliente.mostrarCliente();
        System.out.println("Factura:");
        System.out.println("ID Factura: " + this.ID);
        System.out.println("Fecha: y hora " + this.fyh);
        mostrarItems();
        System.out.println("Monto de factura: " + this.total);
        double porcentaje = unCliente.getDescuento();
        System.out.println("Porcentaje de descuento: %" + porcentaje);
        System.out.println("Monto de descuento: " + (porcentaje*this.total)/100);
        double totalFinal = this.calcularTotal(unCliente);
        System.out.print("Total con descuento: " + totalFinal);
    }
    public int cargarItems ()
    {
        this.ADIV = new ItemVenta[this.dimension];
        int i = 0;
        char control = 's';
        Scanner bf = new Scanner(System.in);

        while (i < this.dimension && control == 's')
        {
            ADIV[i] = new ItemVenta();
            System.out.print("Desea agregar otro item? s/n");
            control = bf.next().charAt(0);
            i++;
        }
        return i;
    }
    public void mostrarItems ()
    {
        int i = 0;
        for (i=0; i<this.cantidad; i++)
        {
            this.ADIV[i].mostrarItem();
        }
    }
    public double sumarItems ()
    {
        double suma = 0;
        double precioT = 0;
        int i = 0;
        for (i=0; i < this.cantidad; i++)
        {
            precioT = ADIV[i].getPrecioTotal();
            suma = suma + precioT;
            //suma+= ADIV[i].getPrecioUnitario();
        }
        return suma;
    }
}
