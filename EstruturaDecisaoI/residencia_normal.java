import static java.lang.IO.*;

void main() {
    print("Digite o consumo em m3: ");
    double consumo = Double.parseDouble(readln());
    double valor;


    if (consumo <= 10) valor = 22.38;
    else if (consumo <= 20) valor = consumo * 3.50;
    else if (consumo <= 50) valor = consumo * 8.75;
    else valor = consumo * 9.64;

    println("Valor da conta: R$ " + String.format("%.2f",valor));
}