import static java.lang.IO.*;

void main() {

    IO.println("Qual a sua idade?");
    int idade = Integer.parseInt(readln());

    if( idade >= 18){
        IO.println("Você é maior de idade!");
    }else {
        IO.println("Você é menor de idade!");
    }
}