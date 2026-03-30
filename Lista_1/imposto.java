import static java.lang.IO.*;
public class imposto {
    void main() {
        double salario = Double.parseDouble(IO.readln("Digite o valor do salário: R$ "));
        // Cálculo INSS
        double inss;
        if (salario <= 1320.00) {
            inss = salario * 0.075;
        } else if (salario <= 2571.29) {
            inss = salario * 0.09;
        } else if (salario <= 3856.94) {
            inss = salario * 0.12;
        } else if (salario <= 7507.49) {
            inss = salario * 0.14;
        } else {
            inss = 7507.49 * 0.14;
        }

        double baseCalculo = salario - inss;

        // Cálculo IRRF
        double irrf;
        if (baseCalculo <= 1903.98) {
            irrf = 0;
        } else if (baseCalculo <= 2826.65) {
            irrf = baseCalculo * 0.075 - 142.80;
        } else if (baseCalculo <= 3751.05) {
            irrf = baseCalculo * 0.15 - 354.80;
        } else if (baseCalculo <= 4664.68) {
            irrf = baseCalculo * 0.225 - 636.13;
        } else {
            irrf = baseCalculo * 0.275 - 869.36;
        }

        IO.println(String.format("%nSalário bruto : R$ %.2f%n", salario));
        IO.println(String.format("Desconto INSS  : R$ %.2f%n", inss));
        IO.println(String.format("Desconto IRRF  : R$ %.2f%n", irrf));
        IO.println(String.format("Salário líquido: R$ %.2f%n", salario - inss - irrf));
    }
}