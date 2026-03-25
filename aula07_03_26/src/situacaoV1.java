import static java.lang.IO.readln;

void main() {
    IO.println("Digite a média final do aluno: ");
    float nota = Float.parseFloat(readln());

    IO.println("Digite a frequência do aluno em porcentagem: ");
    float frequencia = Float.parseFloat(readln());

    if (nota >= 7 && frequencia >= 75) {
        IO.println("Você está aprovado!");
    } else if (nota < 0) {
        IO.println("Erro: não é permitido digitar notas abaixo de zero.");
    } else if (nota < 5 && frequencia < 75) {
        IO.println("Você está reprovado!");
    } else {
        IO.println("Você está de recuperação!");
    }

}
