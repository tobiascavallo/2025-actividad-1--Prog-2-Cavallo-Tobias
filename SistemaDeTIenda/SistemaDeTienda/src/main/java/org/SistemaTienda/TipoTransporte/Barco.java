package org.SistemaTienda.TipoTransporte;

import org.SistemaTienda.Transporte;

public class Barco implements Transporte {
private int precio=4500;

    @Override
    public double Precio(){

        return precio;
    }
    @Override
    public void Descripcion(){
        System.out.println("El envio en barco es de: "+precio+"$");
    }
}
