package com.company.Ejercicio3;

import java.util.Scanner;
import java.util.UUID;
import java.util.zip.Adler32;

public class Cuenta {

    UUID ID;
    double balance;
    ClienteBanco unCliente;
    String arregloString[];
    int cantidad;

    public Cuenta() {
        setID();
        this.balance = 0;
        this.unCliente = new ClienteBanco();
        this.arregloString = new String[10];
        this.cantidad = cargarArreglo();
    }

    public UUID getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public ClienteBanco getUnCliente() {
        return unCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String[] getArregloString() {
        return arregloString;
    }


    public void setID() {
        this.ID = ID.randomUUID();
    }

    public void setBalance(double saldo) {
        this.balance = saldo;
    }

    public void setUnCliente(ClienteBanco unCliente) {
        this.unCliente = unCliente;
    }

    public void setArregloString(String Arreglo[]) {
        this.arregloString = Arreglo;
    }

    public void setCantidad(int cant) {
        this.cantidad = cant;
    }

    public void mostrarCuenta() {
        unCliente.mostrarCliente();
        System.out.println("--------------------------------------");
        System.out.println("ID Cuenta: " + this.ID);
        if (this.balance >= 0)
            System.out.println("Balance: " + this.balance);
        else
            System.out.println("Balance: (" + this.balance + ")");
        System.out.println("--------------------------------------");
    }

    public double depositar() {
        Scanner bf = new Scanner(System.in);
        double monto = 0;
        System.out.print("Ingrese el monto a depositar: \t");
        monto = bf.nextDouble();
        this.balance += monto;

        setBalance(this.balance);
        return monto;
    }

    public double retirar() {
        Scanner bf = new Scanner(System.in);
        double aRetirar = 0;
        System.out.print("Ingrese el monto a retirar: \t");
        aRetirar = bf.nextDouble();

        if ((this.balance + 2000) > aRetirar) {
            this.balance -= aRetirar;
            setBalance(this.balance);

            return aRetirar;
        } else {
            System.out.println("No hay fondos suficientes para retirar ese monto.");
            return 0;
        }

    }

    public int cargarArreglo() {
        Scanner bf = new Scanner(System.in);
        char operacion = 's';
        char control = 's';
        int i = 0;
        double monto = 0;
        String texto = null;

        while ((control == 's' || control == 'S')) { //&& i < 10)
            System.out.print("Ingrese la operación que desea cargar: (D o R)\t");
            operacion = bf.next().charAt(0);

            if (operacion == 'D' || operacion == 'd') {
                monto = depositar();
                texto = "El cliente " + getUnCliente().getNombre() + " depositó " + monto;
                //System.out.println(texto);
                //System.out.println(arregloString[i]);
                arregloString[i] = texto;
                //System.out.println(arregloString[i]);
                i++;
                if (i == 10) {
                    agregarFinal(texto);
                    i--;
                }
            }
            else if (operacion == 'r' || operacion == 'R') {
                    monto = retirar();
                    if (monto != 0) {
                        texto = "El cliente " + getUnCliente().getNombre() + " retiró " + monto;
                        arregloString[i] = texto;
                        i++;
                        if (i == 10) {
                            agregarFinal(texto);
                            i--;
                        }
                    }
                }
            else {
                System.out.println("La opcion ingresada no es correcta.");
                }

                System.out.print("¿Desea realizar otra operación? s/n \t");
                control = bf.next().charAt(0);
        }
        return i;
    }

    public void mostrarMovimientos() {
        int i;
        int cantidad = getCantidad();
        if (cantidad > 10)
            cantidad = 10;

        for (i = 0; i < cantidad; i++) {
            System.out.println("*********************************************************");
            System.out.println(this.arregloString[i]);
            System.out.println("*********************************************************");
        }
    }

    public void mostrarMovimiento() {
        System.out.println("*********************************************************");
        System.out.println(this.arregloString);
        System.out.println("*********************************************************");
    }

    public void agregarFinal(String text) {
        int i;
        for (i = 0; i < 9; i++)
            arregloString[i] = arregloString[i + 1];

        arregloString[i] = text;
    }

}


