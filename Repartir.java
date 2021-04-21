/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author Leonel
 */
public class Repartir {
    private boolean pagado;
    private Compra compra;
    private boolean repartido;

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public boolean isRepartido() {
        return repartido;
    }

    public void setRepartido(boolean repartido) {
        this.repartido = repartido;
    }
    
}
