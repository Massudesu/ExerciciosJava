import static java.lang.IO.*;

void main() {
    print("Digite a velocidade em Km/h: ");
    double velocidade = Double.parseDouble(readln());
    if (velocidade > 80) {
        double excesso = velocidade - 80;
        double valorMulta = excesso * 50;
        println("Limite = 80Km/h");
        println("Excedeu " + excesso + "Km/h");
        println("multa = " + excesso + "Km/h * R$ 50,00");
        println("Valor da multa: R$ " + valorMulta);
    }
}