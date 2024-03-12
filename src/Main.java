import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = nota1 + nota2;

        if (media >= 60.00) {
            System.out.printf("NOTA FINAL: %.2f\n", media);
            System.out.println("Aprovado");
        } else {
            System.out.printf("NOTA FINAL: %.2f\n", media);
            System.out.println("Reprovado");
        }
    }
}