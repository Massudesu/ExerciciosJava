import static java.lang.IO.*;

void main() {
    print("Em que turno você estuda? (M-Matutino, V-Vespertino, N-Noturno): ");
    char entrada = readln().charAt(0);

    if (entrada == 'M') {
        println("Bom Dia!");
    } else if (entrada == 'V') {
        println("Boa Tarde!");
    } else if (entrada == 'N') {
        println("Boa Noite!");
    } else {
        println("Valor inválido!");
    }
}