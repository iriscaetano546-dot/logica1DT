void main() {

    IO.println("Olá, qual turno você estuda? (M-Matutino, T-Tarde, N-Noturno): ");
    String turno = IO.readln("").toLowerCase();
    //toLowerCase usado para converter uma string para letras minúsculas.

    String mensagem = switch (turno) {
        case "m" -> "Bom Dia e bons estudos!";
        case "t" -> "Boa Tarde e bons estudos!";
        case "n" -> "Boa Noite e bons estudos!";
        default -> "Valor Inválido!";
    };

    IO.println(mensagem);

}
