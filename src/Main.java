import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);


        /*
        // Terreno
        double largura, comprimento, metroQuadrado, area, preco;

        System.out.println("Digite a largura do terreno: ");
        largura = scanner.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = scanner.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        metroQuadrado = scanner.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("Área do terreno: %.2f%n", area);
        System.out.printf("Preço do terreno: %.2f%n", preco);*/

/*
        // Idades
        String nomeA, nomeB;
        int idadeA, idadeB;
        double mediaIdade;

        System.out.println("Dados da primeira pessoa: ");
        System.out.println("Nome: ");
        nomeA = scanner.nextLine();
        System.out.println("Idade: ");
        idadeA = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Dados da segunda pessoa: ");
        System.out.println("Nome: ");
        nomeB = scanner.nextLine();
        System.out.println("Idade: ");
        idadeB = scanner.nextInt();

        mediaIdade = (double) (idadeA + idadeB) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos%n", nomeA, nomeB, mediaIdade);*/

        /*
        // troco
        double preco, dinheiro, troco;
        int quantidade;

        System.out.println("Preço unitário do produto: ");
        preco = scanner.nextDouble();
        System.out.println("Quantidade comprada: ");
        quantidade = scanner.nextInt();
        System.out.println("Dinheiro recebido: ");
        dinheiro = scanner.nextDouble();

        troco = dinheiro - (preco * quantidade);

        System.out.printf("TROCO = %.2f%n", troco);*/

        // duracao
        int duracao, horas, minutos, segundos;

        System.out.println("Digite a duração em segundos: ");
        duracao = scanner.nextInt();

        horas = duracao / 3600;
        minutos = (duracao % 3600) / 60;
        segundos = (duracao % 3600) % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

    }
}