import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double coeficienteA, coeficienteB, coeficienteC, x1, x2, delta;

        System.out.println("Coeficiente a:");
        coeficienteA = scanner.nextDouble();
        System.out.println("Coeficiente b:");
        coeficienteB = scanner.nextDouble();
        System.out.println("Coeficiente c:");
        coeficienteC = scanner.nextDouble();

        delta = Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;

        if (coeficienteA == 0 || delta < 0) {
            System.out.println("Esta equação não possui raízes reais");
        } else {
            x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
            x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);
            System.out.printf("R1 = %.4f\n", x1);
            System.out.printf("R2 = %.4f\n", x2);
        }
    }
}