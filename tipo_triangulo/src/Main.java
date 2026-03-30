import static java.lang.IO.*;

void main() {
    print("Lado A: ");
    double a = Double.parseDouble(readln());
    print("Lado B: ");
    double b = Double.parseDouble(readln());
    print("Lado C: ");
    double c = Double.parseDouble(readln());

    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            println("Triângulo: Equilátero");
        } else if (a == b || a == c || b == c) {
            println("Triângulo: Isósceles");
        }else {
            println("Triângulo: Escaleno");
        }
    } else {
        println("Não é um triângulo!");
    }
}