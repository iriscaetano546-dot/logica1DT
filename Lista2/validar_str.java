import static java.lang.IO.*;
void main() {
    IO.println("Digite uma frase: ");
    String frase = readln();

    if(frase == null || frase.isBlank()){
        IO.println("Opção Inválida!");
    }else{
        IO.println("Você digitou -> " + frase);
    }
}