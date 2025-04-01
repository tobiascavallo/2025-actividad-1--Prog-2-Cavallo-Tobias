package org.SistemaTienda.Producto;

import org.SistemaTienda.Product;

public class RopaProduct implements Product {
    private double precio=100;
@Override
    public double Precio(){
    return precio;
}
@Override
public void descripcion(){
    System.out.println("El precio de la ropa es: "+precio);
}

}
