import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Qual a quantidade de atletas? ");
        int N = scanner.nextInt();
        scanner.nextLine();
        double somaPeso = 0, somaAlturaMulheres = 0, maiorAltura = 0;
        String nomeMaisAlto = "";
        int qtdHomens = 0, qtdMulheres = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Digite os dados do atleta numero " + (i + 1) + ": ");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            char sexo;
            do {
                System.out.print("Sexo (F/M): ");
                sexo = scanner.next().charAt(0);
                scanner.nextLine();
                if (sexo != 'F' && sexo != 'M') System.out.println("Valor invalido! Favor digitar F ou M.");
            } while (sexo != 'F' && sexo != 'M');

            double altura;
            do {
                System.out.print("Altura: ");
                altura = scanner.nextDouble();
                if (altura <= 0) System.out.println("Valor invalido! Favor digitar um valor positivo.");
            } while (altura <= 0);

            double peso;
            do {
                System.out.print("Peso: ");
                peso = scanner.nextDouble();
                scanner.nextLine();
                if (peso <= 0) System.out.println("Valor invalido! Favor digitar um valor positivo.");
            } while (peso <= 0);

            somaPeso += peso;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaisAlto = nome;
            }

            if (sexo == 'M') {
                qtdHomens++;
            } else {
                qtdMulheres++;
                somaAlturaMulheres += altura;
            }
        }

        double pesoMedio = somaPeso / N;
        double alturaMediaMulheres = (qtdMulheres > 0) ? somaAlturaMulheres / qtdMulheres : 0;
        double porcentagemHomens = ((double) qtdHomens / N) * 100;

        System.out.println("RELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
        System.out.println("Atleta mais alto: " + nomeMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%\n", porcentagemHomens);
        if (qtdMulheres > 0) {
            System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas.");
        }

        scanner.close();
    }
}
