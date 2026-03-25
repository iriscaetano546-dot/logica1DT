import static java.lang.IO.*;

void main() {
    IO.println("Informe a primeira nota:");
    float n1 = Float.parseFloat(readln());

    IO.println("Informe a segunda nota:");
    float n2 = Float.parseFloat(readln());

    IO.println("Informe a terceira nota:");
    float n3 = Float.parseFloat(readln());

    IO.println("Informe a quarta nota:");
    float n4 = Float.parseFloat(readln());

    //Processamento

    float media = (n1 + n2 + n3 + n4) / 4;

    if( media >= 6){
        IO.println("Nota final: " + media);
        IO.println("Aprovado!");
    }else{
        IO.println("Nota final: " + media);
        IO.println("Reprovado!");
    }


}

