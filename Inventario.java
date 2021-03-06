public class Inventario {
    private String NombreTienda;
    private List<Producto> ListaProductos= new ArrayList<Producto>();
    private int ID;
    
    public String getNombreTienda() {
	return NombreTienda;
    }
    public void setDescripcion(String nombreTienda) {
	NombreTienda = nombreTienda;
    }
    public int getID() {
    	return ID;
    }
    public void setID(int Id) {
    	ID = Id;   
    }
    
    public void AnadirInventario(Producto nuevo){
        this.ListaProductos.add(nuevo);
    }
	
	
	//Se va a eliminar El producto del Array List 
    
    public void EliminarInventario(Producto delate){
        int i=0;
	boolean existe = ListaProductos.contains(delate);
	if (existe) {
		System.out.println("El elemento SÍ existe en la lista");
                
                System.out.println("El elemento se elimino de la lista");
	} else {
            System.out.println("El elemento no existe");
	}
        this.ListaProductos.remove(delate);
        
    }
    public List<Producto> getListaProductos() {
		return ListaProductos;
	}

    public void setListaProductos(List<Producto> listaProductos) {
    	this.ListaProductos = listaProductos;
    }
}
