import static java.lang.IO.*;
void main() {
    IO.println("Qual o consumo de água da residência normal? ");
    float consumo = Float.parseFloat(readln());

    if(consumo <= 10) {
        IO.println("O valor por metros cubicos é R$ 22,38");
    }else if(consumo <= 20){
        IO.println("O valor por metros cubicos é R$ 3,50");
    }else if(consumo <= 50){
        IO.println("O valor por metros cubicos é R$ 8,75");
    }else {
        IO.println("O valor por metros cubicos é R$ 9,64");
    }
}