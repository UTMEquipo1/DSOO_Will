package Persistencia;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Compra> historialCompras;
    public Cliente(String Username,String Nombre,String Contrasenia,String ID,String numeroTelefonico, String Direccion,String correoElectronico, int tipoUsuario, ArrayList<Compra> historialCompras){
        super(Username, Nombre, Contrasenia, ID, numeroTelefonico, Direccion, correoElectronico, tipoUsuario);
        this.historialCompras=historialCompras;
    }
    
    public List<Compra> getHistorialCompras(){
        return historialCompras;
    }
    
    public void setHistorialCompras(List<Compra> historialCompras){
        this.historialCompras=historialCompras;
    }
}