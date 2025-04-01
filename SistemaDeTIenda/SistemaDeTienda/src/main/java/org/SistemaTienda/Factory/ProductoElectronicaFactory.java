package org.SistemaTienda.Factory;
import org.SistemaTienda.Producto.ElectronicProduct;

public class ProductoElectronicaFactory extends ProductFactory {

  @Override
    public ElectronicProduct createProduct(){
      return new ElectronicProduct();
  }
}
