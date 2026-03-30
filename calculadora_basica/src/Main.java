import static java.lang.IO.*;

void main() {
    println("Escolha a operação aritmetica com numeros");
    println("1.Adição");
    println("2.Subtração");
    println("3.Multiplicação");
    println("4.Divisão");
    println("5.Potenciação");
    println("6.Radiciação");
    println("7.Número par");
    println("8.Número impar");
    println("9.Sair");


    String escolha = IO.readln();

    if (escolha.equals("1")){
        print("Primeiro numero: ");
        int n1 = Integer.parseInt(IO.readln());
        print("Segundo numero: ");
        int n2 = Integer.parseInt(IO.readln());
        int n3 = n1 + n2;
        println("Resultado: " + n3);
        println("--------------------------------------------------------------");
    }
    if (escolha.equals("2")){
        print("Primeiro numero: ");
        int n1 = Integer.parseInt(IO.readln());
        print("Segundo numero: ");
        int n2 = Integer.parseInt(IO.readln());
        int n3 = n1 - n2;
        println("Resultado: " + n3);
        println("--------------------------------------------------------------");
    }
    if (escolha.equals("3")){
        print("Primeiro numero: ");
        int n1 = Integer.parseInt(IO.readln());
        print("Segundo numero: ");
        int n2 = Integer.parseInt(IO.readln());
        int n3 = n1 * n2;
        println("Resultado: " + n3);
        println("--------------------------------------------------------------");
    }
    if (escolha.equals("4")){
        print("Primeiro numero: ");
        float n1 = Float.parseFloat(IO.readln());
        print("Segundo numero: ");
        float n2 = Float.parseFloat(IO.readln());
        float n3 = n1 / n2;
        println("Resultado: " + n3);
        println("--------------------------------------------------------------");
    }
    if (escolha.equals("5")){
        print("Número: ");
        int n1 = Integer.parseInt(IO.readln());
        print("Elevado a: ");
        int n2 = Integer.parseInt(IO.readln());
        double n3 = Math.pow(n1, n2);
        println("Resultado: " + n3);
        println("--------------------------------------------------------------");
    }
    if (escolha.equals("6")){
        print("Número: ");
        int n1 = Integer.parseInt(IO.readln());
        double n2 = Math.sqrt(n1);
        println("Resultado: " + n2);
        println("--------------------------------------------------------------");
    }
    if (escolha.equals("7")){
        print("Número: ");
        int n1 = Integer.parseInt(IO.readln());
        if (n1 % 2 ==0) {
            println(n1 + " é par!");
            println("--------------------------------------------------------------");
        }else{
            println(n1 + " não é par!");
            println("--------------------------------------------------------------");
        }

    }
    if (escolha.equals("8")){
        print("Número: ");
        int n1 = Integer.parseInt(IO.readln());
        if (n1 % 2 ==1) {
            println(n1 + " é impar!");
            println("--------------------------------------------------------------");
        }else{
            println(n1 + " não é impar!");
            println("--------------------------------------------------------------");
        }
    }
}