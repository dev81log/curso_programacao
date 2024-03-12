import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double largura, comprimento, metroQuadrado, area, preco;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite a largura do terreno: ");
        largura = scanner.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = scanner.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        metroQuadrado = scanner.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("Área do terreno: %.2f%n", area);
        System.out.printf("Preço do terreno: %.2f%n", preco);

    }
}