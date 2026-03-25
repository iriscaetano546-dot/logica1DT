import static java.lang.IO.*;

void main() {

    IO.println("Tem quintal grande? (S/N) ");
    char quintal = readln().charAt(0);

    IO.println("Consegue passer 2x ao dia? (S/N) ");
    char passer = readln().charAt(0);

    if(quintal == 'S' || quintal == 's' || passer == 'S' || passer == 's'){
        IO.println("Você pode adotar! ");
    }else{
        IO.println("Você não pode adotar!");
    }
}