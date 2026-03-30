import static java.lang.IO.*;

void main() {

    print("Digite a nota do 1º Bimestre: ");
    double n1 = Double.parseDouble(readln());

    print("Digite a nota do 2º Bimestre: ");
    double n2 = Double.parseDouble(readln());

    print("Digite a nota do 3º Bimestre: ");
    double n3 = Double.parseDouble(readln());

    print("Digite a nota do 4º Bimestre: ");
    double n4 = Double.parseDouble(readln());

    double media = (n1 + n2 + n3 + n4) / 4;

    char conceito;
    String situacao;

    if (media >= 9.0 && media <= 10.0) {
        conceito = 'A';
    } else if (media >= 7.5) {
        conceito = 'B';
    } else if (media >= 6.0) {
        conceito = 'C';
    } else if (media >= 4.0) {
        conceito = 'D';
    } else {
        conceito = 'E';
    }

    if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
        situacao = "APROVADO";
    } else {
        situacao = "REPROVADO";
    }

    println("========== BOLETIM ESCOLAR ==========");
    println("Notas Bimestrais: " + String.format("%.1f", n1) +
            " | " + String.format("%.1f", n2) +
            " | " + String.format("%.1f", n3) +
            " | " + String.format("%.1f", n4));
    println("Média Final     : " + String.format("%.1f", media));
    println("Conceito        : " + conceito);
    println("Situação        : " + situacao);
}