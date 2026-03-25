import static java.lang.IO.*;
void main() {
    //Entrada
    IO.println("Valor?");
    float valor = Float.parseFloat(readln());

    IO.println("Valor da taxa?");
    float taxa = Float.parseFloat(readln());

    IO.println("Quanto tempo esta devendo?");
    int tempo = Integer.parseInt(readln());

    //Processamento

    float prestacao = valor + (valor * (taxa / 100) * tempo);

    //Saida
    IO.println("Valor da prestacao = R$ " + prestacao);
}