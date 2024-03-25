import java.util.Scanner;

public class Exercicio3 {
    public static void executar () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        
        if (a == b) {
            System.out.println("A sequência de números informados é inválida. Ambos são iguais.");
        } else if (a > b) {
            System.out.println("O número A é maior que o número B.");
        } else {
            System.out.println("O número B é maior que o número A.");
        }
        
        scanner.close();
    }
}

