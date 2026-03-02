import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Funciones 

public class crudArchivo{
private static final String ARCHIVO="gCliente.txt";
public static void crearCliente(Clientes gCliente) 
throws IOException {
    FileWriter fw = new FileWriter("gCliente.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(gCliente.toString());
    bw.newLine();
    bw.close();
}


public static List<Clientes> leerCliente() 
throws IOException {
    List<Clientes> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("gCliente.txt"));

    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Clientes(
            Integer.parseInt(datos[0]),
            (datos[1]),
            (datos[2]),
            (datos[3]),
            (datos[4]), 
            (datos[5]));

    }
    sc.close();
    return lista;

   List<Clientes> lista = leerCliente();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("usuarios.txt"));

    for (Clientes u : lista) {
        if (u.getId() == id) {
            u.setNombre(nuevoNombre);
        }
        bw.write(u.toString());
        bw.newLine();
    }
    bw.close();
}
      
public static void actualizarCliente(int id, 
String nuevoNombre, String nuevoApellido, int nuevoTelefono, boolean actActivo ) 
throws IOException {

    List<Clientes> lista = leerCliente();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("gCliente.txt"));

    for (Clientes g: lista) {
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

   List<Clientes> lista = leerCliente();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("clientes.txt"));

    for (Clientes u : lista) {
        if (u.getId() != id) {
            bw.write(u.toString());
            bw.newLine();
        }
    }
    bw.close();
}
}
