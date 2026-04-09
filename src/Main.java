import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<cliente> listaclientes = new ArrayList<>();
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n===######## " +
                                                       "TIENDA TECNOLÓGICA                    ############===");
            System.out.println("1. Registrar Regular\n2. Registrar Frecuente\n3. Registrar Mayorista");
            System.out.println("4. Mostrar Todos\n5. Buscar por ID\n6. Mostrar Compras Altas\n0. Salir");
            System.out.print("Opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1, 2, 3 -> registrar(opcion);
                case 4 -> mostrartodo();
                case 5 -> buscar();
                case 6 -> comprasaltas();
            }
        } while (opcion != 0);
    }

    private static void registrar(int tipo) {
        System.out.print("Nombre: "); String n = leer.next();
        System.out.print("ID: "); String id = leer.next();
        System.out.print("Valor Compra: "); double v = leer.nextDouble();

        if (tipo == 1) {
            listaclientes.add(new clienteregular(n, id, v));
        } else if (tipo == 2) {
            System.out.print("Número de compras: ");
            listaclientes.add(new clientefrecuente(n, id, v, leer.nextInt()));
        } else {
            System.out.print("Cantidad productos: ");
            listaclientes.add(new clientemayorista(n, id, v, leer.nextInt()));
        }
        System.out.println("¡Cliente registrado!");
    }

    private static void mostrartodo() {
        for (cliente c : listaclientes) {
            c.imprimirresumen(c.calculartotalcompra());
        }
    }

    private static void buscar() {
        System.out.print("ID a buscar: ");
        String id = leer.next();
        for (cliente c : listaclientes) {
            if (c.getIdentificacion().equals(id)) {
                c.imprimirresumen(c.calculartotalcompra());
                return;
            }
        }
        System.out.println("No encontrado.");
    }

    private static void comprasaltas() {
        System.out.println("\n--- clientes con compras > 300.000 ---");
        for (cliente c : listaclientes) {
            if (c.compraalta()) System.out.println("- " + c.getNombre());
        }
    }
}