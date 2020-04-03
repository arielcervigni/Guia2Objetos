package com.company.Ejercicio2;
import java.net.IDN;
import java.time.*;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import java.util.UUID;
import java.text.SimpleDateFormat;

public class Factura {

    UUID ID;
    double total;
    Date fyh;
    Cliente unCliente;
    ItemVenta ADIV[];
    int dimension;
    int cantidad;

   /// Constructor
    public Factura ()
    {
        this.ID = UUID.randomUUID();
        this.fyh = new Date ();
        this.unCliente = unCliente;
        this.dimension = 3;
        this.cantidad = cargarItems();
        ItemVenta ADIV[];
        this.total = sumarItems();
    }

    /// GETTERS
    public UUID getID()
    {
        return ID;
    }
    public double getTotal ()
    {
        return total;
    }
    public Date getFyh ()
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

    /// SETTERS
    public void setCliente ()
    {
        this.unCliente = unCliente;
    }
    public void setDimension ()  {this.dimension = dimension; }
    public void setCantidad ()  {this.cantidad = cantidad; }
    public void setTotal ()
    {
        this.total = sumarItems();
    }
    public void setADIV(ItemVenta[] ADIV) {
        this.ADIV = ADIV;
    }
    public void setID ()
    {
        this.ID = ID;
    }
    public void setFyh ()
    {
        this.fyh = fyh;
    }

    /// METODOS
    public double calcularTotal ()
    {
       double totalConDescuento = 0;
       double descuento = 0;
       //double porcentaje = unCliente.getDescuento();
       descuento = (unCliente.getDescuento()*this.total)/100;
       totalConDescuento = this.total - descuento;
        return totalConDescuento;
    }
    public void mostrarTodo ()
    {
        mostrarFactura();
        //double porcentaje = unCliente.getDescuento();
        System.out.println("Total de Factura: " + this.total);
        System.out.println("Porcentaje de descuento: %" + unCliente.getDescuento());
        System.out.println("Monto de descuento: " + (unCliente.getDescuento()*this.total)/100);
        //double totalFinal = this.calcularTotal();
        System.out.println("Total con descuento: " + this.calcularTotal());
        System.out.println("++++++++++ Gracias por usar el Programa de Ariel Cervigni ++++++++++++");
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
            System.out.print("Desea agregar otro item? s/n\t");
            control = bf.next().charAt(0);
            i++;
            if (i==3)
                System.out.println("No se puede agregar más items");
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
    public void mostrarFactura ()
    {
        unCliente.mostrarCliente();
        System.out.println("ID Factura: " + ID);
        System.out.println("Fecha y hora: " + fyh);
        System.out.println("Total: " + total);
        mostrarItems();
    }
}
