import static java.lang.IO.readln;

    void main() {


        float dia = Float.parseFloat(readln("Digite um numero de 1 a 7: "));

        switch ((int) dia) {
            case 1:
                IO.println("Domingo");
                break;
            case 2:
                IO.println("Segunda");
                break;
            case 3:
                IO.println("Terça");
                break;
            case 4:
                IO.println("Quarta");
                break;
            case 5:
                IO.println("Quinta");
                break;
            case 6:
                IO.println("Sexta");
                break;
            case 7:
                IO.println("Sabado");
                break;
            default:
                IO.println( "Opção inválida!");
        }

    }
