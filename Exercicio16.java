import java.util.Scanner;

public class Exercicio16 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        // Calculando a média aritmética
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("Média: %.2f\n", media);
        
        scanner.close();
    }
}
