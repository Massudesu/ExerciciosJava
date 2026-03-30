import static java.lang.IO.*;

void main() {
    print("Salário atual: R$ ");
    double salario = Double.parseDouble(readln());
    int percentual;

    if (salario <= 1000) {
        percentual = 20;
    } else if (salario <= 1700) {
        percentual = 15;
    } else if (salario <= 2300){
        percentual = 10;
    } else{
        percentual = 5;
    }

    double aumento = salario * (percentual / 100.0);
    double novoSalario = salario + aumento;
    println("========================================");
    println("Salário digitado: R$ " + salario);
    println("Aumento: " + percentual + "%");
    println("Valor do aumento: R$ " + String.format("%.2f", aumento));
    println("Novo salário: R$ " + novoSalario);
}