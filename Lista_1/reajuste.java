void main() {

    IO.println("Digite o salário atual: R$ ");
    double salario = Double.parseDouble(IO.readln(""));

    double percentual;

    if (salario <= 1000.00) {
        percentual = 0.20;
    } else if (salario <= 1700.00) {
        percentual = 0.15;
    } else if (salario <= 2300.00) {
        percentual = 0.10;
    } else {
        percentual = 0.05;
    }

    double aumento = salario * percentual;
    double novoSalario = salario + aumento;

    IO.println(String.format("%nSalário antes do reajuste: R$ %.2f%n", salario));
    IO.println(String.format("Percentual de aumento    : %.0f%%%n", percentual * 100));
    IO.println(String.format("Valor do aumento         : R$ %.2f%n", aumento));
    IO.println(String.format("Novo salário             : R$ %.2f%n", novoSalario));

    char resposta = IO.readln("Deseja realizar outra operação? (s/n)").charAt(0);
    if (resposta == 's' || resposta == 'S') {
        main();
    } else {
        IO.println("Encerrado!");
    }
}