package Persistencia;

import java.util.List;

public class Vendedor extends Persona {
    private String tipoNegocio;
    private List<Compra> historialVentas;
    
    public Vendedor(String Username,String Nombre,String Contrasenia,String ID,String numeroTelefonico, String Direccion,String correoElectronico, int tipoUsuario,String tipoNegocio, List<Compra> historialVentas){
        super(Username, Nombre, Contrasenia, ID, numeroTelefonico, Direccion, correoElectronico, tipoUsuario);
        this.tipoNegocio=tipoNegocio;
        this.historialVentas=historialVentas;
    }
    
    public String getTipoNegocio(){
        return tipoNegocio;
    }
    
    public void setTipoNegocio(String tipoNegocio){
        this.tipoNegocio=tipoNegocio;
    }
    
    public List <Compra> getHistorialVentas(){
        return historialVentas;
    }
    
    public void setHistorialVentas(List<Compra> historialVentas){
        this.historialVentas=historialVentas;
    }
}