import java.util.Scanner;

public class multa {
    public static void main (String args[]){

        Scanner multa = new Scanner(System.in);

        System.out.println("Qual a velocidade do seu carro? ");

        float valor = multa.nextFloat();

        if(valor > 80){
            float excedeu = valor - 80;
            float valorMulta = excedeu * 50;

            System.out.println("Multado!, você excedeu o limite maximo de 80Km/h");
            System.out.println("Valor da multa: " + valorMulta);
            System.out.println("Você excedeu "+ excedeu +"Km/h");

        }


    }
}
