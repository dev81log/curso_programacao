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

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.23456700;

        System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n", product1, price1, product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}