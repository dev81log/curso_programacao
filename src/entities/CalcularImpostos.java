package entities;

public class CalcularImpostos {

    public static double calcularImpostoSalario(double rendaAnual) {
        double rendaMensal = rendaAnual / 12;
        double impostoSalario = 0.0;

        if (rendaMensal >= 3000 && rendaMensal < 5000) {
            impostoSalario = rendaAnual * 0.10;
        } else if (rendaMensal >= 5000) {
            impostoSalario = rendaAnual * 0.20;
        }
        return impostoSalario;
    }

    public static double calcularImpostoServicos(double rendaAnual) {
        return rendaAnual * 0.15;
    }

    public static double calcularImpostoCapital(double rendaAnual) {
        return rendaAnual * 0.20;
    }

    public static double calcularAbatimento(double impostoBruto, double gastosMedicos, double gastosEducacionais) {
        double maximoDedutivel = impostoBruto * 0.3;
        double gastosDedutiveis = gastosMedicos + gastosEducacionais;
        return Math.min(maximoDedutivel, gastosDedutiveis);
    }

}
