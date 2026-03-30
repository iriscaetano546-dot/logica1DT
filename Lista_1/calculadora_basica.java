void main() {

    IO.println("           _____________________");
    IO.println("           | |1| Adição         |");
    IO.println("           | |2| Subtração      |");
    IO.println("           | |3| Multiplicação  |");
    IO.println("           | |4| Divisão        |");
    IO.println("           | |5| Potência       |");
    IO.println("           | |6| Raiz Quadrada  |");
    IO.println("           | |7| Número Ímpar   |");
    IO.println("           | |8| Número Par     |");
    IO.println("           ---------------------");


    IO.println("Escolha uma operação: ");
    int opcao = Integer.parseInt(IO.readln(""));
    IO.println("Digite o primeiro número: ");
    double n1 = Double.parseDouble(IO.readln(""));


    double n2 = 0;
    if (opcao >= 1 && opcao <= 5) {


        n2 = Double.parseDouble(IO.readln("Digite o segundo número: "));
    }

    switch (opcao) {
        case 1 -> IO.println(String.format("Resultado: %.2f%n", n1 + n2));
        case 2 -> IO.println(String.format("Resultado: %.2f%n", n1 - n2));
        case 3 -> IO.println(String.format("Resultado: %.2f%n", n1 * n2));
        case 4 -> {
            if (n2 == 0) {
                IO.println("Erro: divisão por zero!");
            } else {
                IO.println(String.format("Resultado: %.2f%n", n1 / n2));
            }
        }
        case 5 -> IO.println(String.format("Resultado: %.2f%n", Math.pow(n1, n2)));
        case 6 -> IO.println(String.format("Resultado: %.2f%n", Math.sqrt(n1)));
        case 7 -> IO.println((n1 % 2 != 0) ? n1 + " é ímpar." : n1 + " não é ímpar.");
        case 8 -> IO.println((n1 % 2 == 0) ? n1 + " é par." : n1 + " não é par.");
        default -> IO.println("Opção inválida!");
    }


    char resposta = IO.readln("Deseja realizar outra operação? (s/n)").charAt(0);
    if (resposta == 's' || resposta == 'S') {
        main();
    } else {
        IO.println("Encerrado!");
    }
}