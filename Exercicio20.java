import java.util.Scanner;

public class Exercicio20 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoViagemHoras = scanner.nextDouble();
        
        System.out.print("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMedia = scanner.nextDouble();
        
        // Calculando a distância da viagem
        double distanciaViagem = tempoViagemHoras * velocidadeMedia;
        
        // Calculando a quantidade de litros de combustível gasta
        double litrosCombustivel = distanciaViagem / 12;
        
        System.out.println("Quantidade de litros de combustível gasta: " + litrosCombustivel);
        
        scanner.close();
    }
}