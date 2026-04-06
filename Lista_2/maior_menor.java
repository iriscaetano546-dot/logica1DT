import java.util.Scanner;

public class maior_menor {
    public static void main(String args[]){

        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float num1 = numeros.nextFloat();

        System.out.println("Digite o segundo número: ");
        float num2 = numeros.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float num3 = numeros.nextFloat();

        System.out.println("*************************");

        float maior = 0;

        if (num1 >= num2 && num1 >= num3){
             maior = num1;
        }else if (num2 >= num1 && num2 >= num3){
            maior = num2;
        }else {
            maior = num3;
        }
        System.out.println("Número maior -> " + maior);

        float menor = 0;
        if(num1 <= num2 && num1 <= num3){
            menor = num1;
        }else if (num2 <= num1 && num2 <= num3){
            menor = num2;
        }else {
            menor = num3;
        }

        System.out.println("Número menor -> " + menor);

        float soma = num1 + num2 + num3;
        System.out.printf("A soma dos 3 números -> %.2f\n" + soma);

        float media = soma / 3;
        System.out.printf("Média dos números -> %.2f\n", media);

    }
}
