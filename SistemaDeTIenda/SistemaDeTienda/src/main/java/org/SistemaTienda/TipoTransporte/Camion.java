package org.SistemaTienda.TipoTransporte;

import org.SistemaTienda.Transporte;

public class Camion implements Transporte {
private int precio=3500;

    @Override
    public double Precio(){
        return precio;
    }
    @Override
    public void Descripcion(){
        System.out.println("El envio en camion es de: "+precio+"$");
    }
}
