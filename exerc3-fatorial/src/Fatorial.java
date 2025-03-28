public class Fatorial {

    // Metodo para calcular o fatorial de um numero
    public static long calcularFatorial(int numero) {
        long fatorial = 1;

        for(int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
