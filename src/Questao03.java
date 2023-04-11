import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        if (sobrenome.equals("Wayne")) {
            System.out.println("Acesso liberado, Sr. Wayne");
        } else if (sobrenome.equals("Kent")) {
            System.out.println("Saí daí, mané!");
        } else if (nome.equals("Diana")) {
            System.out.println("Bem-vinda, Princesa de Themyscara");
        } else {
            System.out.println("Cai fora!");
        }
    }
}

