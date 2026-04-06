import static java.lang.IO.*;

void main() {
    print("num1 = ");
    double n1 = Double.parseDouble(readln());
    print("num2 = ");
    double n2 = Double.parseDouble(readln());
    print("num3 = ");
    double n3 = Double.parseDouble(readln());

    double maior = Math.max(n1, Math.max(n2, n3));
    double menor = Math.min(n1, Math.min(n2, n3));
    double soma = n1 + n2 + n3;
    double media = soma / 3;

    println("**********");
    println("maior = " + maior);
    println("menor = " + menor);
    println("soma = " + soma);
    println("media = " + media);
}