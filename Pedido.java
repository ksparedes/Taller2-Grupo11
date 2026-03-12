public class Pedido {
    private int idcliente;
    private int idpedido;
    private String categoria;
    private String producto;

    public Pedido(int idcliente, int idpedido, String categoria, String producto) {
        this.idcliente = idcliente;
        this.idpedido = idpedido;
        this.categoria = categoria;
        this.producto = producto;
    }
    public int getIdc(){return idcliente;}
    public int getIdp(){return idpedido;}
    public String getCategoria(){return categoria;}
    public String getProducto(){return producto;}
    public void setCategoria(String nombre){this.categoria=categoria;}
    public void setProducto(String email){this.producto=producto;}
    @Override
    public String toString() {
        return idpedido + "," + idcliente+ "," + categoria + "," + producto;
    }
}
