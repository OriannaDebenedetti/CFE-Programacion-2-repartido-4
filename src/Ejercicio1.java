public class Ejercicio1 {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int entrada = 8;
        boolean resultado = esPar(entrada);
        System.out.println("¿Es par? " + resultado);
    }
}
