package org.SistemaTienda.Factory;
import org.SistemaTienda.Producto.VehicleProduct;

public class ProductoVehiculoFactory extends ProductFactory {

    @Override
    public VehicleProduct createProduct(){
        return new VehicleProduct();
    }
}
