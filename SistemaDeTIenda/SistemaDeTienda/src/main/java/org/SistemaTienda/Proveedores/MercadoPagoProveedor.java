package org.SistemaTienda.Proveedores;

import org.SistemaTienda.ProveedorDePago;

public class MercadoPagoProveedor implements ProveedorDePago {

    @Override
    public void ejecutarTransaccion(double monto){
        System.out.println("pago de " + monto + " pesos procesado con Mercado Pago");
    }
}
