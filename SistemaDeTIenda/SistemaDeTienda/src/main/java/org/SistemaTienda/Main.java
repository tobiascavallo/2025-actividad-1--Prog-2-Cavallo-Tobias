package org.SistemaTienda;
import org.SistemaTienda.PagoService.TarjetaCredito;

import java.util.Scanner;

public class Main {
    static Scanner entrada= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("bienvenido a tu tienda online de producto variado");
        System.out.println("Selecciona que tipo de producto desea");
        System.out.println("1 = Elextronica, 2 = Ropa, 3 = vehiculo");

        int eleccionProducto = entrada.nextInt();

        System.out.println("Para proseguir con el apgo seleccione con que pagará el debido producto");
        System.out.println("1 = mercado pago, 2 = Pay Pal");
        int eleccionProveedor= entrada.nextInt();

        System.out.println("Ahora ingrese como desea el envio");
        System.out.println("1 = avion, 2 = barco, 3 = camion");
        int eleccionTransporte= entrada.nextInt();

        TarjetaCredito tarjetaCredito= new TarjetaCredito(eleccionProveedor,eleccionProducto,eleccionTransporte);
        
        tarjetaCredito.procesarPago();










    }
}