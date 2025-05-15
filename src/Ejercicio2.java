public class Ejercicio2 {
    public static void mayorValor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("Mayor valor: " + mayor);
    }

    public static void main(String[] args) {
        int[] array = {3, 9, 1, 7, 4};
        mayorValor(array);
    }
}

