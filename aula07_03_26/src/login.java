import static java.lang.IO.readln;
void main() {
    IO.println("Qual o seu usuario: ");
    String login = readln();

    IO.println("Qual a sua senha: ");
    String senha = readln();

    if(login.equals("admin") && senha.equals("1234")){
        IO.println("Login bem sucedido!");
    }else{
        IO.println("Acesso negado!");
    }
}