/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.ArrayList;

/**
 *
 * @author Leonel
 */
public class Compra {
    private Cliente nombreCliente;
    private Vendedor nombreVendedor;
    private ArrayList<Producto> listaProductos;
    private float montoTotal;
    private float noFolio;
    private Repartidor nombreRepartidor;
    
    public Compra(){
        
    }

    public Cliente getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(Cliente nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Vendedor getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(Vendedor nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public float getNoFolio() {
        return noFolio;
    }

    public void setNoFolio(float noFolio) {
        this.noFolio = noFolio;
    }

    public Repartidor getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(Repartidor nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }
    
}
