package Persistencia;
public abstract class Persona {
    private String Username;
    private String Nombre;
    private String Contrasenia;
    private String ID;                  //Modificado
    private String numeroTelefonico;    //Modificado
    private String Direccion;
    private String correoElectronico;
    private int tipoUsuario;
    
    public Persona(String Username,String Nombre,String Contrasenia,String ID,String numeroTelefonico, String Direccion,String correoElectronico, int tipoUsuario){
        this.Username=Username;
        this.Nombre=Nombre;
        this.Contrasenia=Contrasenia;
        this.ID=ID;
        this.numeroTelefonico=numeroTelefonico;
        this.Direccion=Direccion;
        this.correoElectronico=correoElectronico;
        this.tipoUsuario=tipoUsuario;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public void setUsername(String Username){
        this.Username=Username;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getContrasenia(){
        return Contrasenia;
    }
    
    public void setContrasenia(String Contrasenia){
        this.Contrasenia=Contrasenia;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setID(String ID){
        this.ID=ID;
    }
    
    public String getNumeroTelefonico(){
        return numeroTelefonico;
    }
    
    public void setNumeroTelefonico(String numeroTelefonico){
        this.numeroTelefonico=numeroTelefonico;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion=Direccion;
    }
    
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico=correoElectronico;
    }
    
    public int getTipoUsuario(){
        return tipoUsuario;
    }
    
    public void setTipoUsuario(int tipoUsuario){
        this.tipoUsuario=tipoUsuario;
    }
}
