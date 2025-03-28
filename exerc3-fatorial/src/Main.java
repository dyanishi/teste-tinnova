import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valorPermitido = false;

        while (!valorPermitido) {
            System.out.println("Digite um número inteiro para calcular o fatorial:");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= 0) {
                    valorPermitido = true;
                } else {
                System.out.println("Por favor digitar um número inteiro");
                }
            } else {
                System.out.println("Valor inválido! Por favor digitar um número inteiro");
                scanner.next();
            }
        }

        long resultadoFatorial = Fatorial.calcularFatorial(numero);
        System.out.printf("%d! = %d \n", numero, resultadoFatorial);
    }
}
