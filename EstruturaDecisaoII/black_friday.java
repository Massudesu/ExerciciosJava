import static java.lang.IO.*;

void main() {
    print("Preço total da venda: ");
    double preco = Double.parseDouble(readln());
    println("1-À vista | 2-Débito | 3-Crédito | 4-PIX");
    print("Forma de pagamento: ");
    char forma = readln().charAt(0);
    
    double desconto = 0;

    if (forma == '1') {
        desconto = 0.10;
    } else if (forma == '2') {
        desconto = 0.05;
    } else if (forma == '3') {
        desconto = 0.03;
    } else if (forma == '4') {
        desconto = 0.075;
    }

    println("Valor final: R$ " + (preco * (1 - desconto)));
}