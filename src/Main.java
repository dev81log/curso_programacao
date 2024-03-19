import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.Name = scanner.nextLine();
        product.Name = scanner.nextLine();
        System.out.print("Price: ");
        product.Price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        product.Quantity = scanner.nextInt();

        System.out.println();
        System.out.println("Product data: " + product.Name + ", $"
                + product.Price + ", " + product.Quantity
                + " units, Total: $" + product.TotalValueInStock());

        scanner.close();
    }
}
