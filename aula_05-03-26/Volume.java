import java.lang.Math;
void main() {
    IO.print("Digite o valor do raio:");
    float raio = Float.parseFloat(IO.readln());

    IO.print("Digite o valor da altura:");
    Float altura = Float.parseFloat(IO.readln());

    double volume = Math.PI * Math.pow(raio,2) * altura;

    //Saida
    IO.println("Volume:" + String.format("%.2f",volume));
}