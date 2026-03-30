import static java.lang.Double.parseDouble;

    void main() {

        IO.println("Digite seu peso (kg): ");
        double peso = parseDouble(IO.readln(""));

        IO.println("Digite sua altura (mt): ");
        double altura = parseDouble(IO.readln(""));

        double imc = peso / (altura * altura);

        String classificacao;

        if (imc < 16) {
            classificacao = "Magreza grave";
        } else if (imc < 17) {
            classificacao = "Magreza moderada";
        } else if (imc < 18.5) {
            classificacao = "Magreza leve";
        } else if (imc < 25) {
            classificacao = "Saudável";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }

        IO.println(String.format("Seu IMC: %.2f%n", imc));
        IO.println("Classificação: " + classificacao);

        char resposta = IO.readln("Deseja realizar o calculo novamente? (s/n)").charAt(0);
        if (resposta == 's' || resposta == 'S') {
            main();
        } else {
            IO.println("Encerrando a calculadora. Até mais!");
        }
    }

