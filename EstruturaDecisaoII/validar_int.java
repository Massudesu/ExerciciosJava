import static java.lang.IO.*;

void main() {
    print("Digite um inteiro: ");
    String entrada = readln();
    if (entrada == null || entrada.trim().isEmpty()) {
        println("Dado inválido");
    } else {
        println(entrada);
    }
}