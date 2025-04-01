package org.SistemaTienda.TipoTransporte;

import org.SistemaTienda.Transporte;

public class Avion implements Transporte {
    private double precio=6000;

    public double Precio(){
        return precio;
    }

    @Override
    public void Descripcion(){
        System.out.println("El envio en avion es de: "+precio+"$");
    }
}
