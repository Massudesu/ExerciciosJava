import static java.lang.IO.*;

void main() {
    print("Usuário: ");
    String user = readln();
    print("Senha: ");
    String senha = readln();

    if ((user.equals("atila") && senha.equals("12345")) || (user.equals("olivi") && senha.equals("54321"))) {
        println("Seja bem vindo!");
    } else {
        println("Usuário e senha não conferem");
    }
}