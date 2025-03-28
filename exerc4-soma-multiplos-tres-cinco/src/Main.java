import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valorPermitido = false;

        // Enquanto não receber valor permitido
        while (!valorPermitido) {
            System.out.println("Digite um número inteiro:");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero >= 0) {  //Validar se número é positivo ou zero
                    valorPermitido = true;
                } else {
                    System.out.println("Por favor digitar um número inteiro");
                }
            } else {
                System.out.println("Valor inválido! Por favor digitar um número inteiro");
                scanner.next();
            }
        }

        int resultadoSoma = SomaMultiplos.somaMultiplosTresOuCinco(numero);
        System.out.printf("A soma dos multiplos de 3 ou 5, abaixo de %d é: %d", numero, resultadoSoma);

    }
}