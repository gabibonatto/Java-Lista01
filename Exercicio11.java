import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();
        
        int menor, meio, maior;
        
        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
            if (numero2 < numero3) {
                meio = numero2;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero2;
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
            if (numero1 < numero3) {
                meio = numero1;
                maior = numero3;
            } else {
                meio = numero3;
                maior = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 < numero2) {
                meio = numero1;
                maior = numero2;
            } else {
                meio = numero2;
                maior = numero1;
            }
        }
        
        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio + ", " + maior);
        
        scanner.close();
    }
}
