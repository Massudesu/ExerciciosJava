import static java.lang.IO.*;

void main() {
    print("Litros: ");
    double litros = Double.parseDouble(readln());
    print("Tipo (A-Álcool / G-Gasolina): ");
    char tipo = readln().toUpperCase().charAt(0);
    
    double preco = 0;
    double desc = 0;

    if (tipo == 'A') {
        preco = 2.89;
        if (litros <= 20) {
            desc = 0.03;
        } else {
            desc = 0.05;
        }
    } else if (tipo == 'G') {
        preco = 4.95;
        if (litros <= 20) {
            desc = 0.04;
        } else {
            desc = 0.06;
        }
    }

    println("Valor a pagar: R$ " + (litros * (preco * (1 - desc))));
}