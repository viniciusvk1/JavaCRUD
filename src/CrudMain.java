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

        switch (chooseMenu) {
            case 1: // Functionality of adding a new product to the list
                System.out.println("=========================================");
                System.out.print("Enter the name of the product you want to add: ");
                String productName = sc.nextLine();
                products.add(productName);
                System.out.print("Product added successfully!\n");
                break;
            case 2: // Showing all products added
                System.out.println("=========================================");
                System.out.println("Available products: ");
                System.out.println(products);
                System.out.println();
                break;
            case 3: // Modification of added products in the queue
                System.out.println("=========================================");
                System.out.print("Choose the product to be changed: ");
                String searchProductName = sc.nextLine();

                if (products.contains(searchProductName)) { // If the product exists in the list it will be removed and one added in its place
                    System.out.print("Enter the product change: ");
                    String changeProductName = sc.nextLine();
                    products.remove(searchProductName);
                    products.add(changeProductName);
                    System.out.println("Altered product!\n");
                } else { // House does not hold in line nothing will happen
                    System.out.println("Invalid product!\n");
                }
                System.out.println("Updated products: ");
                System.out.println(products);
                break;
            case 4: // Deleting products
                System.out.println("=========================================");
                System.out.println("Choose the product you want to delete: ");
                String removeProduct = sc.nextLine();
                if (products.contains(removeProduct)) { // if the indicated product exists in the list it will be excluded
                    products.remove(removeProduct);
                    System.out.println("Product excluded!\n");
                } else { // otherwise, nothing will change
                    System.out.println("Invalid product!\n");
                }
                System.out.println("Updated products: ");
                System.out.println(products);
                break;
            default: //Default option to indicate an error of the user's choice
                System.out.println("Invalid option!\n");

                
        }
        while (chooseMenu != 0) ;

        sc.close();
    }
}
