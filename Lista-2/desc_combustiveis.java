import java.util.*;
public class desc_combustiveis{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros: ");
        float litros = sc.nextFloat();

        System.out.println("G - Gasolina");
        System.out.println("A - Álcool");

        System.out.println("Digite o tipo de combustível: ");
        char tipo = sc.next().toUpperCase().charAt(0);

        double preco = 0;
        double desconto = 0;
        if (tipo == 'G'){
            preco = 4.95;

            if(litros <= 20){
                desconto = 0.04;
            }else{
                desconto = 0.06;
            }

            }else if (tipo == 'A'){
            preco = 2.89;

            if(litros <= 20){
              desconto = 0.03;
            }else{
                desconto = 0.05;
            }
        }else {
            System.out.println("Opção Inválida!");
        }

        double valorBruto = litros * preco;
        double valorDesconto = valorBruto * desconto;
        double valorFinal = valorBruto - valorDesconto;

        System.out.printf("Valor final a pagar: R$ %.2f", valorFinal);
    }
}
