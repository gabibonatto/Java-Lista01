import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro termo (a1) da progressão aritmética: ");
        int a1 = scanner.nextInt();
        
        System.out.print("Digite a razão (r) da progressão aritmética: ");
        int r = scanner.nextInt();
        
        System.out.print("Digite a ordem do termo (n) que deseja encontrar: ");
        int n = scanner.nextInt();
        
        int an = a1 + (n - 1) * r;
        
        System.out.println("O " + n + "-ésimo termo da progressão aritmética é: " + an);
        
        scanner.close();
    }
}