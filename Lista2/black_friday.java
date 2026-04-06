import static java.lang.IO.*;
void main() {

    IO.println("Informe o valor da compra: ");
    Float valor = Float.parseFloat(readln());

    IO.println("Código\tCondição de Pagamento\tDesconto (%)");

    IO.println("1 \t     À vista (em espécie)     10");
    IO.println("2\t     Cartão de débito         5");
    IO.println("3\t     Cartão de crédito        3");
    IO.println("4\t     PIX                     7.5");

    IO.println("Qual a forma de pagamento? ");
    int formaPagamento = Integer.parseInt(readln());

    switch (formaPagamento){
        //Dinheiro
        case 1 :
            double dinheiro = valor - (valor * 0.1);
            IO.println(String.format("Valor total: R$ %.2f",dinheiro));
            break;

        // Cartão de debito
        case 2 :
            double cartaoDebito = valor - (valor * 0.05);
            IO.println(String.format("Valor total: R$ %.2f",cartaoDebito));
            break;

        //Cartao de credito
        case 3:
            double cartaoCredito = valor - (valor * 0.03);
            IO.println(String.format("Valor total: R$ %.2f",cartaoCredito));
            break;

        //Pix
        case 4:
            double pix = valor - (valor * 0.075);
            IO.println(String.format("Valor total: R$ %.2f", pix));
            break;

        default:
            IO.println("Opção Inválida");
            break;
    }

}