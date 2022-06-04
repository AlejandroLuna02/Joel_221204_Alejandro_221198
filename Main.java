package Actividad_C1_A2_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("");
            System.out.println(" *** Pizzas la UP ***");
            System.out.println("");
            System.out.println("1. Ordenar pizzas");
            System.out.println("2. Salir ");
            System.out.println("");
            System.out.println("Elija una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Ordenar();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Se que vas a regresar xD");
                    System.out.println("");
                    System.out.println(" **** Que te vaya bonito ****");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Esa opcion no esta en el menu");
                    System.out.println("");
                    System.out.println(" Vuelve a intentarlo ...");
            }
        }while (opcion !=2);

    }
    public static void Ordenar(){
        String nombre;
        byte opcion;
        Pedido pedido1;
        Pizza pizza1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el nombre del cliente");
        nombre = teclado.nextLine();
        System.out.println("1. Jamon");
        System.out.println("2. Mexicana");
        System.out.println("3. Peperoni");
        System.out.println("Elija la pizza de su agrado: ");
        opcion = teclado.nextByte();
        Tienda tienda = new Tienda((byte) (opcion-1),nombre);

        pedido1 = tienda.SendPedido();
        pizza1 = pedido1.SendPizza();
        System.out.println("  Nombre del cliente: " + pedido1.getCliente().getNombrecliente());
        System.out.println("  precio de la pizza: " + pizza1.getPrecio());
        System.out.println("  nombre de la pizza: " + pizza1.getNombre());


    }
}
