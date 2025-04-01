package org.SistemaTienda.PagoService;
import org.SistemaTienda.Factory.ProductFactory;
import org.SistemaTienda.Factory.ProductoElectronicaFactory;
import org.SistemaTienda.Factory.ProductoRopaFatory;
import org.SistemaTienda.Factory.ProductoVehiculoFactory;
import org.SistemaTienda.Product;
import org.SistemaTienda.ProveedorDePago;
import org.SistemaTienda.Proveedores.MercadoPagoProveedor;
import org.SistemaTienda.Proveedores.PayPalProveedor;
import org.SistemaTienda.TipoTransporte.Avion;
import org.SistemaTienda.TipoTransporte.Barco;
import org.SistemaTienda.TipoTransporte.Camion;
import org.SistemaTienda.Transporte;

public abstract class Compra {
protected ProveedorDePago provedor;
protected Product product;
protected Transporte transporte;
public double monto;

ProductFactory factory=null;

public Compra(int provedor, int producto, int transporteEleccion){
    if (producto==1){

        factory = new ProductoElectronicaFactory();
        System.out.println("Perfecto, su producto electronico será procesado para el pago");

    }else if(producto==2){

        factory=new ProductoRopaFatory();
        System.out.println("Perfecto, su producto ropa será procesado para el pago");

    }else {

        factory=new ProductoVehiculoFactory();
        System.out.println("Perfecto, su vehiculo será procesado para el pago");

    }
     product = factory.createProduct();
     product.descripcion();


    if(provedor == 1){

        this.provedor= new MercadoPagoProveedor();

    } else {

        this.provedor=new PayPalProveedor();

    }

    if(transporteEleccion == 1){

        transporte= new Avion();

    } else if (transporteEleccion == 2) {

        transporte= new Barco();

    }else {

        transporte=new Camion();

    }
    transporte.Descripcion();
     this.monto= transporte.Precio()+product.Precio();
}



public abstract void procesarPago();

}
