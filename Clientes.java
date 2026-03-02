
public class Clientes {
 
    private int id_cliente;
    private int activo;
    private String nombre; 
    private String apellido;
    private String telefono;

    public Clientes(int id_cliente, String nombre, int activo, String telefono, String apellido) {
        this.id_cliente = id_cliente;
        this.activo = activo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
       
    }
    public int getId(){
        return id_cliente;
    }
    public String getActivo(){
        return activo;
    }
    public void setActivo(int activo){
        this.activo = activo;
    }

    @Override
    public String toString() {
        return id_cliente + "," + cliente_activo;
    }
}
      
