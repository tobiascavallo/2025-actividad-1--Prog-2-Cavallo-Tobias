package org.SistemaTienda.Factory;
import org.SistemaTienda.Producto.RopaProduct;

public class ProductoRopaFatory extends ProductFactory {

    @Override
    public RopaProduct createProduct(){
        return new RopaProduct();
    }


}
