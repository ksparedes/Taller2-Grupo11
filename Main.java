import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("1. Registrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Registrar pedido");
            System.out.println("5. Listar pedidos de cliente");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                   
                break;

                case 2:
                     
                break;

                case 3:

                break;

                case 4:
                    System.out.println("ID pedido:");
                    int idpedido = sc.nextInt();

                    System.out.println("ID cliente:");
                    int idcliente = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Categoria:");
                    String categoria = sc.nextLine();

                    System.out.println("Producto:");
                    String producto = sc.nextLine();

                    Pedido p = new Pedido(idpedido,idcliente,categoria, producto);

                    CRUDpedido.crearPedido(p);

                break;

                case 5:

                  

                break;

            }

        }while(opcion != 0);

    }
}