package quizzzz_facturacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Descuento descuento = new Descuento(20);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Crear Tarjeta");
            System.out.println("2. Leer tarjeta");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce los datos de la tarjeta:");
                    System.out.print("Número de cuenta: ");
                    String numeroDeCuenta = scanner.nextLine();
                    System.out.println("Introduce los datos de valort apertura:");
                    System.out.print("Valor apertura: ");
                    double valorApertura = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce el mes:");
                    System.out.print("Mes: ");
                    String mes = scanner.nextLine();
                    
                    descuento.crearTar(numeroDeCuenta, valorApertura, mes);
                    break;
                    
                case 2:
                    System.out.println("Lista de Tarjetas:");
                    descuento.leerTarjeta();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}