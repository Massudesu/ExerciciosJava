import static java.lang.IO.*;
void main() {
    print("Peso (kg): ");
    double peso = Double.parseDouble(readln());
    print("Altura (m): ");
    float altura = Float.parseFloat(readln());

    double imc = peso / Math.pow(altura, 2);
    String classif;

    if (imc < 16) classif = "Magreza grave";
    else if (imc < 17) classif = "Magreza moderada";
    else if (imc < 18.5) classif = "Magreza leve";
    else if (imc < 25) classif = "Saudável";
    else if (imc < 30) classif = "Sobrepeso";
    else if (imc < 35) classif = "Obesidade Grau I";
    else if (imc < 40) classif = "Obesidade Grau II (severa)";
    else classif = "Obesidade Grau III (mórbida)";

    println("IMC: " + String.format("%.2f", imc)+" e a Classificação: " + String.format("%s", classif));
}