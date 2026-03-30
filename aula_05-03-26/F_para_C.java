void main() {
    //Entrada
    IO.print("Digite o valor de graus Fahrenheit:");
    String fString = IO.readln();
    float f = Float.parseFloat(fString);
    float f = Float.parseFloat(IO.readln());

    //Processamento
    Float c = ((f-32)*5)/9;

    //Saida
    IO.print("A temperatura em graus Celsius:" + c);
}