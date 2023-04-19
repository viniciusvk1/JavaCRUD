import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
Creating a CRUD (Create, Read, Update, Delete) using Java.

- Collections
- Flow control structures
- Repetition Structure

           This project is being used as a tool for studying the Java language.
 */


public class CrudMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int chooseMenu;

        ArrayList<String> products = new ArrayList<>();

        // Menu that will appear in the terminal of the chosen IDE
        System.out.println("=========================================");
        System.out.println("=====            Menu               =====");
        System.out.println("=========================================");
        System.out.println("1 - Add Product:                    =====");
        System.out.println("2 - Show all products added         =====");
        System.out.println("3 - Change a product                =====");
        System.out.println("4 - Delete a product                =====");
        System.out.println("0 - Close program                   =====");
        System.out.println("=========================================");
        System.out.print("\nChoose an option: ");
        chooseMenu = sc.nextInt();
        sc.nextLine();
        
        sc.close();
    }
}
