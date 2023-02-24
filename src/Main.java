import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Linky linkedList = new Linky();

        // add elements to the linked list
        linkedList.insertAtFirst("Apple");
        linkedList.insertAtFirst("Banana");
        linkedList.insertAtFirst("Cherry");


        int option;
        do {
            //Menu
            System.out.println("1. Isertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer");
            System.out.println("4. Buscar un elemento");
            System.out.println("5. Borrar un elemento");
            System.out.println("6. Salir");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Ingrese valor");
                    String valor = sc.next();
                    // display the linked list before inserting an item at the first position
                    System.out.print("LinkedList before inserting an item at the first position: ");
                    linkedList.traverse();

                    // insert an item at the first position
                    linkedList.insertAtFirst(valor);

                    // display the linked list after inserting an item at the first position
                    System.out.print("LinkedList after inserting an item at the first position: ");
                    linkedList.traverse();
                    break;
                case 2:
                    System.out.println("Ingrese valor");
                    valor = sc.next();
                    // display the linked list before inserting an item at the first position
                    System.out.print("LinkedList before inserting an item at the first position: ");
                    linkedList.traverse();

                    // insert an item at the first position
                    linkedList.insertAtTail(valor);

                    // display the linked list after inserting an item at the first position
                    System.out.print("LinkedList after inserting an item at the first position: ");
                    linkedList.traverse();
                    break;
                case 3:
                    linkedList.traverse();
                    break;
            }
        } while (option != 6);

    }
}
