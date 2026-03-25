import static java.lang.IO.*;

void main() {

    //Entradas
    IO.println("Entre com o tempo:");
    float tempo = Float.parseFloat(readln());

    IO.println("Entre com a velocidade:");
    float velocidade = Float.parseFloat(readln());

    //Processamentos

    float distancia = tempo * velocidade;
    float litros = distancia / 12;

    //Saida
    IO.println("Tempo:" + " " + tempo + " " +"minutos");
    IO.println("Velocidade Media:" + " "  + velocidade + "km/h");
    IO.println("Distancia percorrida:"+ " " + distancia + "km");
    IO.println("Litros Usados:" + " " + String.format("%.0f",litros));
}
