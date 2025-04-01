package org.SistemaTienda.Producto;

import org.SistemaTienda.Product;

public class VehicleProduct implements Product {
    private double precio=50000;

    @Override
    public double Precio(){
        return precio;
    }
    @Override
    public void descripcion(){
        System.out.println("El precio del vehiculo es: "+ precio);
    }

}
