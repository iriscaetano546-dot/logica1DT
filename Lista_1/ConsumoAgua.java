import static java.lang.IO.*;
void main() {

    IO.println("Qual o consumo de agua da residencia social? ");
    float consumo = Float.parseFloat(readln());

    if(consumo <= 10) {
        IO.println("O valor por metros cubicos é R$ 7,59");
    }else if(consumo <= 20){
       IO.println("O valor por metros cubicos é R$ 1,31");
    }else if (consumo <= 30){
        IO.println("O valor por metros cubicos é R$ 4,64");
    }else if(consumo <= 50){
        IO.println("O valor por metros cubicos é R$ 6,62");
    }else {
        IO.println("O valor por metros cubicos é R$ 7,31");
    }
}
