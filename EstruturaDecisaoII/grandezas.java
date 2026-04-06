import static java.lang.IO.*;

void main() {
    println("******************************");
    println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
    println("******************************");
    println("1. Tensão | 2. Resistência | 3. Corrente | 4. Sair");
    print("Qual grandeza deseja calcular? ");
    
    char opcao = readln().charAt(0);

    if (opcao == '1') {
        print("Resistência: ");
        double r = Double.parseDouble(readln());
        print("Corrente: ");
        double i = Double.parseDouble(readln());
        println("Tensão: " + (r * i) + " V");
    } else if (opcao == '2') {
        print("Tensão: ");
        double u = Double.parseDouble(readln());
        print("Corrente: ");
        double i = Double.parseDouble(readln());
        println("Resistência: " + (u / i) + " Ώ");
    } else if (opcao == '3') {
        print("Tensão: ");
        double u = Double.parseDouble(readln());
        print("Resistência: ");
        double r = Double.parseDouble(readln());
        println("Corrente: " + (u / r) + " A");
    } else if (opcao == '4') {
        println("Saindo...");
    } else {
        println("Opção inválida!");
    }
}