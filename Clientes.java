import java.util.ArrayList;
import java.util.Scanner;

public class guardarCliente {
 
    private int id_cliente;
    private boolean cliente_activo;
    private String nombre 
    private String apellido
    private int telefono

    public guardarCliente(int id_cliente, boolean cliente_activo) {
        this.id_cliente = id_cliente;
        this.cliente_activo = cliente_activo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
       
    }

      public int getId(){return id;}
    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public int getTelefono(){return telefono;}
    public Boolean getEstado(){return cliente_activo;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setapellido(String apellido){this.apellido=apellido;}
    

    @Override
    public String toString() {
        return id_cliente + "," + cliente_activo";
    }
}
      