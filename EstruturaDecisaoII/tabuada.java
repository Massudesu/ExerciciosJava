import static java.lang.IO.*;

void main() {
    print("Informe o número da tabuada: ");
    int n = Integer.parseInt(readln());
    for (int i = 1; i <= 10; i++) {
        println(i + " x " + n + " = " + (i * n));
    }
}