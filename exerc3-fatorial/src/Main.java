import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular o fatorial:");
        int numero = scanner.nextInt();

        long resultadoFatorial = Fatorial.calcularFatorial(numero);
        System.out.printf("%d! = %d \n", numero, resultadoFatorial);
    }
}
