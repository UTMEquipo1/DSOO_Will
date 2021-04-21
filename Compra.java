package Persistencia;
import java.util.List;

public class Compra {
    private Cliente NombreCliente;
    private Vendedor NombreVendedor;
    private List<Producto> ListaProductos;
    private float montoTotal;
    private float noFolio;
    private Repartidor NombreRepartidor;  
    
    public Compra(Cliente NombreCliente, Vendedor NombreVendedor, List<Producto> ListaProductos, float montoTotal, float noFolio, Repartidor NombreRepartidor){
    this.NombreCliente = NombreCliente;
    this.NombreVendedor = NombreVendedor;
    this.ListaProductos = ListaProductos;
    this.montoTotal = montoTotal;
    this.noFolio = noFolio;
    this.NombreRepartidor = NombreRepartidor;
}

public Cliente getNombreCliente(){
    return NombreCliente;
}

public void setNombreCliente(Cliente NombreCliente){
    this.NombreCliente = NombreCliente;
}

public Vendedor getNombreVendedor(){
    return NombreVendedor;
}

public void setNombreVendedor(Vendedor NombreVendedor){
    this.NombreVendedor = NombreVendedor;
}
      
public List<Producto> getListaProductos(){
    return ListaProductos;
}

public void setListaProductos(List<Producto> ListaProductos){
    this.ListaProductos = ListaProductos;
}

public float getmontoTotal(){
    return montoTotal;
}

public void setmontoTotal(float montoTotal){
    this.montoTotal = montoTotal;
}

public float getnoFolio(){
    return noFolio;
}

public void setnoFolio(float noFolio){
    this.noFolio = noFolio;
}

public Repartidor getNombreRepartidor(){
    return NombreRepartidor;
}

public void setNombreRepartidor(Repartidor NombreRepartidor){
    this.NombreRepartidor = NombreRepartidor;
}
}








