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

                break;

                case 5:

                  

                break;

            }

        }while(opcion != 0);

    }
}