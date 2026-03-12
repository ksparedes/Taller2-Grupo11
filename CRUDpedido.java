import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUDpedido {
    private static final String ARCHIVO ="pedido.txt";

    public static void crearPedido(Pedido pedido) 
throws IOException {
    FileWriter fw = new FileWriter("pedido.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(pedido.toString());
    bw.newLine();
    bw.close();
}
public static List<Pedido> leerPedido() 
throws IOException {
    List<Pedido> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("pedido.txt"));

    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Pedido(
            Integer.parseInt(datos[0]),
            Integer.parseInt(datos[1]),
            datos[2],
            datos[3]));
    }
    sc.close();
    return lista;
}
public static void actualizarPedido(int idcliente, int idpedido,
String nuevaCategoria, String nuevoPedido) 
throws IOException {

    List<Pedido> lista = leerPedido();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("pedido.txt"));

    for (Pedido p : lista) {
        if (p.getIdc() == idcliente && p.getIdp() == idpedido){
            p.setCategoria(nuevaCategoria);
            p.setProducto(nuevoPedido);
        }
        bw.write(p.toString());
        bw.newLine();
    }
    bw.close();
}
public static void eliminaPedido(int id) 
throws IOException {

    List<Pedido> lista = leerPedido();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("pedido.txt"));

    for (Pedido p : lista) {
        if (p.getIdp() != id) {
            bw.write(p.toString());
            bw.newLine();
        }
    }
    bw.close();
}
}
