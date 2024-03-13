import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double rendaAnualSalario, rendaAnualServicos,
                rendaAnualCapital, gastosMedicos, gastosEducacionais,
                impostoSalario, impostoServicos, impostoCapital,
                impostoBruto, abatimento, impostoLiquido;


        System.out.println("Renda anual com salário:");
        rendaAnualSalario = scanner.nextDouble();
        System.out.println("Renda anual com prestação de serviço:");
        rendaAnualServicos = scanner.nextDouble();
        System.out.println("Renda anual com ganho de capital:");
        rendaAnualCapital = scanner.nextDouble();
        System.out.println("Gastos médicos:");
        gastosMedicos = scanner.nextDouble();
        System.out.println("Gastos educacionais:");
        gastosEducacionais = scanner.nextDouble();


        impostoSalario = CalcularImpostos.calcularImpostoSalario(rendaAnualSalario);
        impostoServicos = CalcularImpostos.calcularImpostoServicos(rendaAnualServicos);
        impostoCapital = CalcularImpostos.calcularImpostoCapital(rendaAnualCapital);

        impostoBruto = impostoSalario + impostoServicos + impostoCapital;
        abatimento = CalcularImpostos.calcularAbatimento(impostoBruto, gastosMedicos, gastosEducacionais);
        impostoLiquido = impostoBruto - abatimento;


        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.println("Imposto sobre salário: " + impostoSalario);
        System.out.println("Imposto sobre serviços: " + impostoServicos);
        System.out.println("Imposto sobre ganho de capital: " + impostoCapital);
        System.out.println();
        System.out.println("DEDUÇÕES:");
        System.out.println("Máximo dedutível: " + abatimento);
        System.out.println("Gastos dedutíveis: " + (gastosMedicos + gastosEducacionais));
        System.out.println();
        System.out.println("RESUMO:");
        System.out.println("Imposto bruto total: " + impostoBruto);
        System.out.println("Abatimento: " + abatimento);
        System.out.println("Imposto devido: " + impostoLiquido);

        scanner.close();
    }
}





