import static java.lang.IO.*;
void main() {
    IO.println("Digite um número inteiro:");
    String numero = readln();

    if (numero == null || numero.isBlank()){
        IO.println("Opção Inválida!");
    }else {
        IO.println("O numero que você digitou -> " + numero);
    }
}