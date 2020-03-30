package com.company.Ejercicio2;
import java.net.IDN;
import java.time.*;
import java.util.UUID;

public class Factura {

    UUID ID;
    double total;
    LocalDateTime fyh;
    Cliente unCliente;

    public Factura (Cliente unCliente)
    {
        setID();
        this.total = total;
        setFyh();
        this.unCliente = unCliente;
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

    public void setTotal ()
    {
        this.total = total;
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
        System.out.println(fyh);
        this.fyh = fyh;
    }
    public void mostrarFactura ()
    {
        System.out.println("ID Factura: " + ID);
        unCliente.mostrarCliente();
        System.out.println("Fecha y hora: " + fyh);
        System.out.println("Total: " + total);
    }
}
