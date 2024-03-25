import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 5: ");
        int numero = scanner.nextInt();
        
        String numeroPorExtenso;
        
        switch (numero) {
            case 1:
                numeroPorExtenso = "Um";
                break;
            case 2:
                numeroPorExtenso = "Dois";
                break;
            case 3:
                numeroPorExtenso = "Três";
                break;
            case 4:
                numeroPorExtenso = "Quatro";
                break;
            case 5:
                numeroPorExtenso = "Cinco";
                break;
            default:
                numeroPorExtenso = "Número inválido!";
        }
        
        System.out.println(numeroPorExtenso);
        
        scanner.close();
    }
}
