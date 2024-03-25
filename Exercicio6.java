import java.util.Scanner;

public class Exercicio6 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convertendo a temperatura de Celsius para Fahrenheit
        double fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
        
        scanner.close();
    }
}
