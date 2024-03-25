import java.util.Scanner;

public class Exercicio9 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        
        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            if (a > b) {
                System.out.println("O número A é maior que o número B.");
            } else {
                System.out.println("O número B é maior que o número A.");
            }
        }
        
        scanner.close();
    }
}
