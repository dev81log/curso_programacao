import entities.Product;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        setDefault(US);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.Name = scanner.nextLine();
        System.out.print("Price: ");
        product.Price = scanner.nextDouble();
        System.out.print("Quantity in stock add: ");
        product.AddProducts(scanner.nextInt());

        System.out.println();
        System.out.println("Product data: " + product.Name + ", $"
                + product.Price + ", " + product.Quantity
                + " units, Total: $" + product.TotalValueInStock());

        System.out.print("Quantity in stock remove: ");
        product.RemoveProducts(scanner.nextInt());
        System.out.println("Product data total in Stock: " + product.Quantity + " units, Total: $" + product.TotalValueInStock());

        scanner.close();
    }
}
