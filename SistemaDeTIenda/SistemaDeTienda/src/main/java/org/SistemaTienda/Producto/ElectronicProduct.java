package org.SistemaTienda.Producto;

import org.SistemaTienda.Product;

public class ElectronicProduct implements Product {
    private double precio=2000;

@Override
    public double Precio(){
    return precio;
}
@Override
    public void descripcion(){
        System.out.println("el precio del prodcuto electronico es: "+precio);
}
}
