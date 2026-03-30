import static java.lang.IO.*;

void main() {
    print("Digite o consumo em m3: ");
    double consumo = Double.parseDouble(readln());
    double valor;

    if (consumo <= 10) valor = 7.59;
    else if (consumo <= 20) valor = consumo * 1.31;
    else if (consumo <= 30) valor = consumo * 4.64;
    else if (consumo <= 50) valor = consumo * 6.62;
    else valor = consumo * 7.31;

    println("Valor da conta: R$ " + String.format("%.2f" , valor));
}