import static java.lang.Double.parseDouble;

    void main() {

        IO.println("Digite o lado A: ");
        double a = Double.parseDouble(IO.readln());
        IO.println("Digite o lado B: ");
        double b = Double.parseDouble(IO.readln());
        IO.println("Digite o lado C: ");
        double c = Double.parseDouble(IO.readln(""));


        boolean triangulo = (a + b > c) && (a + c > b) && (b + c > a);

        if (!triangulo) {
            IO.println("Os valores informados NÃO formam um triângulo.");
        } else {

            String formato;
            if (a == b && b == c) {
                formato = "Equilátero";
            } else if (a == b || a == c || b == c) {
                formato = "Isósceles";
            } else {
                formato = "Escaleno";
            }
            IO.println("Os valores formam um triângulo " + formato + ".");

            char resp = IO.readln("Deseja saber outro formato de triângulo? (s/n)").charAt(0);
            if (resp == 's' || resp == 'S') {
                main();
            } else {
                IO.println("Finalizado. Até mais!");
            }
        }
    }