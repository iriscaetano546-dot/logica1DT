import static java.lang.IO.*;
void main() {
    IO.println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
    IO.println("******************************");
    IO.println("1. Tensão (em Volt)");
    IO.println("2. Resistência (em Ohm)");
    IO.println("3. Corrente (em Ampére)");
    IO.println("4. Sair do programa");
    IO.println("******************************");

    IO.println("Qual grandeza deseja calcular?");
    int calcular = Integer.parseInt(readln());

    switch(calcular){

        //Tensão
        case 1 :
            IO.println("Resistência: ");
            float resistencia = Float.parseFloat(readln());
            IO.println("Corrente: ");
            float corrente = Float.parseFloat(readln());

            float tensao = resistencia * corrente;
            IO.println("Tensão: " + tensao + " Voltz");
            break;

        //Resistencia
        case 2 :
            IO.println("Tensão: ");
            float tensao1 = Float.parseFloat(readln());
            IO.println("Corrente: ");
            float corrente1 = Float.parseFloat(readln());

            float resistencia1 = tensao1 * corrente1;
            IO.println("Tensão: " + resistencia1 + " Ohm");
            break;

        case 3 :
            IO.println("Tensão: ");
            float tensao2 = Float.parseFloat(readln());
            IO.println("Resistencia: ");
            float resistencia2 = Float.parseFloat(readln());

            float corrente2 = tensao2 * resistencia2;
            IO.println("Corrente: " + corrente2 + " Ampére");
            break;

        case 4 :
            IO.println("Desligando Calculadora!");
            break;

        default:
            IO.println("Opcão inválida!");
            break;




    }
}
