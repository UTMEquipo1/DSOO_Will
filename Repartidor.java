package Persistencia;

import java.util.List;

public class Repartidor extends Persona{
    private String Vehiculo;
    private List<Compra> historialPedidos;
    
    public Repartidor(String Username,String Nombre,String Contrasenia,String ID,String numeroTelefonico, String Direccion,String correoElectronico, int tipoUsuario,String Vehiculo, List<Compra> historialPedidos){
        super(Username, Nombre, Contrasenia, ID, numeroTelefonico, Direccion, correoElectronico, tipoUsuario);
        this.Vehiculo=Vehiculo;
        this.historialPedidos=historialPedidos;
    }
    
    public String getVehiculo(){
        return Vehiculo;
    }
    
    public void setVehiculo(String Vehiculo){
        this.Vehiculo=Vehiculo;
    }
    
    public List<Compra> getHistorialPedidos(){
        return historialPedidos;
    }
    
    public void setHistorialPedidos(List<Compra> historialPedidos){
        this.historialPedidos=historialPedidos;
    }
}
