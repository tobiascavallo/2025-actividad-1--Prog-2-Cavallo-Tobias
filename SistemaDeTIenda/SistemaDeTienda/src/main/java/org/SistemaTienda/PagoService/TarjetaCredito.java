package org.SistemaTienda.PagoService;

public class TarjetaCredito extends Compra {
    public TarjetaCredito(int proveedor, int producto, int transporteEleccion){
        super(proveedor, producto, transporteEleccion);
    }

    @Override
    public void procesarPago(){
        provedor.ejecutarTransaccion(monto);
        System.out.println("GRACIAS POR SU COMPRA");
    }


}
