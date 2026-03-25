import static java.lang.IO.readln;

void main() {

    //Entradas
    IO.println("Entre com o tempo:");
    float tempo = Float.parseFloat(readln());

    IO.println("Entre com a velocidade:");
    float velocidade = Float.parseFloat(readln());

    IO.println("Entre com a Autonomia:");
    float autonomia = Float.parseFloat(readln());

    IO.println("Valor do combustivel:");
    float gasolina = Float.parseFloat(readln());

    //Processamentos

    float distancia = tempo * velocidade;
    float litros = distancia / autonomia;
    float combustivel = gasolina * litros;

    //Saida
    IO.println("Tempo: " + tempo + " " +"minutos");
    IO.println("Velocidade Media: " +  velocidade + "km/h");
    IO.println("Distancia percorrida: "+ distancia + "km");
    IO.println("Litros Usados: " + String.format("%.0f",litros) + " litros");
    IO.println("Valor gasto com gasolina: " + "R$ " + combustivel);
}

