import static java.lang.IO.*;

void main() {
    while (true) {
        println("1 - Opção 1");
        println("2 - Opção 2");
        println("3 - Opção 3");
        println("4 - Sair");

        String escolha = IO.readln();

        if (escolha.equals("1")){
            println("Você selecionou a opção 1");
            println("--------------------------------------------------------------");
        }
        if (escolha.equals("2")){
            println("Você selecionou a opção 2");
            println("--------------------------------------------------------------");
        }
        if (escolha.equals("3")){
            println("Você selecionou a opção 3");
            println("--------------------------------------------------------------");
        }
        if (escolha.equals("4")){
            println("Você selecionou sair");
            println("--------------------------------------------------------------");
            break;
        }else{
            println("Opção inválida!!!");
            println("--------------------------------------------------------------");
        }
    }
}