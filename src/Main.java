import entities.Bill;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sexo (F ou M): ");
        char gender = scanner.nextLine().charAt(0);

        System.out.println("Digite a quantidade de cervejas: ");
        int beers = scanner.nextInt();

        System.out.println("Digite a quantidade de refrigerantes: ");
        int softDrinks = scanner.nextInt();

        System.out.println("Digite a quantidade de espetinhos: ");
        int barbecues = scanner.nextInt();

        scanner.close();

        Bill bill = new Bill(gender, beers, barbecues, softDrinks);

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
        System.out.println("Couvert = " + bill.cover());
        System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
        System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());
    }
}
