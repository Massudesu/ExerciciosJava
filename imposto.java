import static java.lang.IO.*;

void main() {
    print("Digite o valor do salário bruto: R$ ");
    double salarioBruto = Double.parseDouble(readln());

    //inss
    double descontoInss;
    if (salarioBruto <= 1621.00) {
        descontoInss = salarioBruto * 0.075;
    } else if (salarioBruto <= 2902.84) {
        descontoInss = (salarioBruto * 0.09) - 24.32;
    } else if (salarioBruto <= 4354.27) {
        descontoInss = (salarioBruto * 0.12) - 111.40;
    } else if (salarioBruto <= 8475.55) {

        descontoInss = (salarioBruto * 0.14) - 198.49;
    } else {
        descontoInss = 988.09;
    }

    // irrf
    double baseCalculoIrrf = salarioBruto - descontoInss;
    double descontoIrrf;


    if (baseCalculoIrrf <= 2259.20) {
        descontoIrrf = 0;
    } else if (baseCalculoIrrf <= 2828.65) {
        descontoIrrf = (baseCalculoIrrf * 0.075) - 169.44;
    } else if (baseCalculoIrrf <= 3751.05) {
        descontoIrrf = (baseCalculoIrrf * 0.15) - 381.44;
    } else if (baseCalculoIrrf <= 4664.68) {
        descontoIrrf = (baseCalculoIrrf * 0.225) - 662.77;
    } else {
        descontoIrrf = (baseCalculoIrrf * 0.275) - 896.00;
    }

    if (descontoIrrf < 0) descontoIrrf = 0;

    double salarioLiquido = salarioBruto - descontoInss - descontoIrrf;

    println("Salário Bruto   : R$ " + String.format("%.2f", salarioBruto));
    println("Desconto INSS   : R$ " + String.format("%.2f", descontoInss));
    println("Desconto IRRF   : R$ " + String.format("%.2f", descontoIrrf));
    println("---------------------------------------------");
    println("Salário Líquido : R$ " + String.format("%.2f", salarioLiquido));
    println("=============================================");
}