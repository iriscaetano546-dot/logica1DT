
    import static java.lang.IO.readln;

    void main() {

        IO.println("             ___________");
        IO.println("             |1| Opção |");
        IO.println("             |2| Opção |");
        IO.println("             |3| Opção |");
        IO.println("             |4| Sair  |");
        IO.println("             -----------");

        float dia = Float.parseFloat(readln("Digite uma Opção(Somente o numero de 1 a 4: "));

        switch ((int) dia) {
            case 1:
                IO.println("Você selecionou a opção 1");
                break;
            case 2:
                IO.println("Você selecionou a opção 2");
                break;
            case 3:
                IO.println("Você selecionou a opção 3");
                break;
            case 4:
                IO.println("Você selecionou sair");
                break;
            default:
                IO.println("Opção inválida!!!");
        }
        char resposta = IO.readln("Deseja escolher outra opção? (s/n)").charAt(0);
        if (resposta == 's' || resposta == 'S') {
            main();
        } else {
            IO.println("Fim do programa!");
        }

    }
