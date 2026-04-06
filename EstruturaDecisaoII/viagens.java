import static java.lang.IO.*;

void main() {
    print("Distância da viagem (km): ");
    double distancia = Double.parseDouble(readln());
    double preco = (distancia <= 200) ? distancia * 0.50 : distancia * 0.45;
    println("Preço da passagem: R$ " + preco);
}