import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double variavelX = 10.35784;
        System.out.println(variavelX);
        System.out.printf("%.2f%n", variavelX);
        System.out.printf("%.4f%n", variavelX);

        Locale.setDefault(Locale.US);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}