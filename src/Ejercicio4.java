public class Ejercicio4 {
    public static void imprimirNumeros(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            imprimirNumeros(n - 1);
        }
    }

    public static void main(String[] args) {
        int entrada = 4;
        imprimirNumeros(entrada);
    }
}
