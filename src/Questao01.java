import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite uma operação (+, -, *, /, ^, raiz): ");
        String op = scanner.next();

        double resultado = 0.0;
        switch (op) {
            case "+":
                System.out.print("Digite outro número: ");
                double num2 = scanner.nextDouble();
                resultado = num1 + num2;
                break;
            case "-":
                System.out.print("Digite outro número: ");
                num2 = scanner.nextDouble();
                resultado = num1 - num2;
                break;
            case "*":
                System.out.print("Digite outro número: ");
                num2 = scanner.nextDouble();
                resultado = num1 * num2;
                break;
            case "/":
                System.out.print("Digite outro número: ");
                num2 = scanner.nextDouble();
                resultado = num1 / num2;
                break;
            case "^":
                System.out.print("Digite o expoente: ");
                double expoente = scanner.nextDouble();
                resultado = Math.pow(num1, expoente);
                break;
            case "raiz":
                System.out.print("Digite o tipo de raiz (quadrada ou cúbica): ");
                String tipoRaiz = scanner.next();
                if (tipoRaiz.equals("quadrada")) {
                    resultado = Math.sqrt(num1);
                } else if (tipoRaiz.equals("cúbica")) {
                    resultado = Math.cbrt(num1);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        System.out.println("Resultado: " + resultado);
    }
}

