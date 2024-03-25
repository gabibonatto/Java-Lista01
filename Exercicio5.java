import java.util.Scanner;

public class Exercicio5 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        
        System.out.println("Valores originais:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        
        // Troca dos valores usando uma variável auxiliar
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Valores trocados:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        
        scanner.close();
    }
}
