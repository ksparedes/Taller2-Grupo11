public class id_pedido {
    private int id_pedido;
    private int id_cliente;
    private String producto;
    private int precio;
    private int cantidad;
    private int activo;


    public Usuario(int id_pedido, int id_cliente, String producto, double precio, int cantidad, int activo) {
        this.id_pedido = id_pedido;
        this.producto = producto;
        this.id_cliente = id_cliente;
        this.activo = activo;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public int getId_cliente(){
        return id_cliente;
    }
    public int getActivo(){
        return activo;
    } 
    public void setActivo(int Activo){
        this.activo = activo;
    }    

    @Override
    public String toString() {
        return id + "," + nombre + "," + email;
    }
}
      
