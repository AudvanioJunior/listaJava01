import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Digite a escala de temperatura (Celsius, Fahrenheit, Kelvin): ");
        String escala = scanner.next();

        double celsius = 0.0;
        double fahrenheit = 0.0;
        double kelvin = 0.0;

        switch (escala) {
            case "Celsius":
                celsius = temperatura;
                fahrenheit = (celsius * 1.8) + 32;
                kelvin = celsius + 273.15;
                break;
            case "Fahrenheit":
                fahrenheit = temperatura;
                celsius = (fahrenheit - 32) / 1.8;
                kelvin = celsius + 273.15;
                break;
            case "Kelvin":
                kelvin = temperatura;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 1.8) + 32;
                break;
            default:
                System.out.println("Escala de temperatura inválida.");
                return;
        }

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}

