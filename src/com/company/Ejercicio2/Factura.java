package com.company.Ejercicio2;
import java.net.IDN;
import java.time.*;
import java.util.Formatter;
import java.util.UUID;

public class Factura<total, descuento> {

    UUID ID;
    double total;
    LocalDateTime fyh;
    Cliente unCliente;

    public Factura (Cliente unCliente, double total)
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
        this.fyh = fyh;
    }
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
        System.out.println("Factura:");
        System.out.println("ID Factura: " + this.ID);
        System.out.println("Fecha: y hora " + this.fyh);
        System.out.println("Monto de factura: " + this.total);
        double porcentaje = unCliente.getDescuento();
        System.out.println("Porcentaje de descuento: %" + porcentaje);
        System.out.println(" Monto de descuento: " + (porcentaje*this.total)/100);
        unCliente.mostrarCliente();
        double totalFinal = this.calcularTotal(unCliente);
        System.out.print("Total con descuento: " + totalFinal);

    }
}
