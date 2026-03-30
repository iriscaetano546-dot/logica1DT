void main() {

    IO.println("Digite a 1ª nota: ");
    float n1 = Float.parseFloat(IO.readln());
    IO.println("Digite a 2ª nota: ");
    float n2 = Float.parseFloat(IO.readln());
    IO.println("Digite a 3ª nota: ");
    float n3 = Float.parseFloat(IO.readln());
    IO.println("Digite a 4ª nota : ");
    float n4 = Float.parseFloat(IO.readln());

    float media = (n1 + n2 + n3 + n4) / 4;

    char conceito;
    if (media >= 9.0) {
        conceito = 'A';
    } else if (media >= 7.5) {
        conceito = 'B';
    } else if (media >= 6.0) {
        conceito = 'C';
    } else if (media >= 4.0) {
        conceito = 'D';
    } else {
        conceito = 'E';
    }

    String situacao = (conceito == 'A' || conceito == 'B' || conceito == 'C') ? "APROVADO" : "REPROVADO";

    IO.print(String.format("%nNotas: %.1f | %.1f | %.1f | %.1f%n", n1, n2, n3, n4));
    IO.print(String.format("Média final : %.2f%n", media));
    IO.print(String.format("Conceito    : %c%n", conceito));
    IO.print(String.format("Situação    : %s%n", situacao));
    if (situacao.equals("APROVADO")) {
        IO.print("Aprovado!");
    } else {
        IO.print("Reprovado.");
    }
    char resposta = IO.readln("Deseja saber a situação de outro aluno? (s/n)").charAt(0);
    if (resposta == 's' || resposta == 'S') {
        main();
    } else {
        IO.println("Encerrando");
    }

}
