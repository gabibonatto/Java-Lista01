import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        double resultado;
        
        if (operador == '+') {
            resultado = a + b;
            System.out.println("O resultado da operação A + B é: " + resultado);
        } else if (operador == '-') {
            resultado = a - b;
            System.out.println("O resultado da operação A - B é: " + resultado);
        } else if (operador == '*') {
            resultado = a * b;
            System.out.println("O resultado da operação A * B é: " + resultado);
        } else if (operador == '/') {
            if (b != 0) {
                resultado = a / b;
                System.out.println("O resultado da operação A / B é: " + resultado);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Operador não definido!");
        }
        
        scanner.close();
    }
}
