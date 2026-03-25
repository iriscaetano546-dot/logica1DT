import static java.lang.IO.readln;
void main() {
    IO.println("Digite o valor da compra: ");
    float valor = Float.parseFloat(readln());

    IO.println("Você é cliente premium? (S/N) ");
    char cliente = readln().charAt(0);

    if(valor >= 150 || cliente == 'S'){
        IO.println("Frete Grátis! ");
    }else{
        IO.println("Frete pago! ");
    }
}