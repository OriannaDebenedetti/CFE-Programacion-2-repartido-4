public class Ejercicio3 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int entrada = 5;
        int resultado = factorial(entrada);
        System.out.println("Factorial de " + entrada + ": " + resultado);
    }
}

