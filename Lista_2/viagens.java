import java.util.Scanner;

public class viagens {
    public static void main (String[] args) {

        Scanner viagem = new Scanner(System.in);

        System.out.println("Qual a distância que você deseja percorrer? ");

        float distacia = viagem.nextFloat();

        if (distacia <= 200 ){
            double valor = distacia *  0.50;
            System.out.printf("O valor da passagem é: " + valor);
        }else if (distacia > 200){
            double maisCara = distacia * 0.45;
            System.out.println("O valor da passagem é: " + maisCara);
        }

    }
}
