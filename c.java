import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.io.IOException;

public class 
public static void crearCliente(guardarCliente gCliente) 
throws IOException {
    FileWriter fw = new FileWriter("gCliente.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(gCliente.toString());
    bw.newLine();
    bw.close();
}


public static List<clientes> leerCliente() 
throws IOException {
    List<clientes> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("gCliente.txt"));

    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new guardarCliente(
            Integer.parseInt(datos[0]),
            datos[1],
            datos[2]));
    }
    sc.close();
    return lista;


    public static void actualizarCliente(int id, 
String nuevoNombre, String nuevoApellido, int nuevoTelefono, boolean actActivo ) 
throws IOException {

    List<clientes> lista = leerCliente();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("gCliente.txt"));

    for (guardarCliente g: lista) {
        if (g.getid_cliente() == id) {
            g.setnombre(nuevoNombre);
            g.setapellido(nuevoApellido);
            g.settelefono(nuevoTelefono);
            g.setactivo(actActivo);
        }
        bw.write(u.toString());
        bw.newLine();
    }
    bw.close();
}
      

public static void eliminarCliente(int id) 
throws IOException {

    List<clientes> lista = leerCliente();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("gCliente.txt"));

    for (guardarCliente g : lista) {
        if (u.getid_cliente() != id) {
            bw.write(u.toString());
            bw.newLine();
        }
    }
    bw.close();
}
     

      