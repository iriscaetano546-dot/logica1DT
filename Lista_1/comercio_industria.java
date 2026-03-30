import static java.lang.IO.*;

void main() {
    IO.println("Qual o consumo de água do prédios comercial? ");
    float consumo = Float.parseFloat(readln());

    if(consumo <= 10) {
        IO.println("O valor é R$ 44,95");
    }else if(consumo <= 20){
        IO.println("O valor por metros cubicos é R$ 8,75");
    }else if(consumo <= 50){
        IO.println("O valor por metros cubicos é R$ 16,76");
    }else {
        IO.println("O valor por metros cubicos é R$ 17,46");
    }
}
