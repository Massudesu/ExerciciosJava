import static java.lang.IO.*;
void main() {
    print("Qual dia da semana de (1 a 7): ");
    String dia = IO.readln();

    if (dia.equals("1")){
        print("Domingo");
    } else if (dia.equals("2")) {
        print("Segunda");
    } else if (dia.equals("3")){
        print("Terça");
    } else if (dia.equals("4")) {
        print("Quarta");
    } else if (dia.equals("5")) {
        print("Quinta");
    }else if (dia.equals("6")){
        print("Sexta");
    } else if (dia.equals("7")) {
        print("Sábado");
    }else {
        print("Opção inválida");
    }
}