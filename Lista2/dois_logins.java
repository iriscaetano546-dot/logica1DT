import static java.lang.IO.*;
void main() {
    IO.println("Qual é o seu login? ");
    String login = readln();

    IO.println("Qual a senha? ");
    String senha = readln();

    if (login.equals("atila") && senha.equals("12345")){
        IO.println("Seja bem vindo!");
    }else if(login.equals("olivi") && senha.equals("54321")){
        IO.println("Seja bem vindo!");
    }else {
        IO.println("Usuário e senha não conferem");
    }
}