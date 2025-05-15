import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su cédula sin puntos ni guiones: ");
        String cedula = scanner.nextLine();

        if (cedula.length() < 7 || cedula.length() > 8) {
            System.out.println("La cédula debe tener entre 7 y 8 dígitos.");
            return;
        }

        // Completar con ceros a la izquierda si tiene 7 dígitos
        while (cedula.length() < 8) {
            cedula = "0" + cedula;
        }

        int[] coeficientes = {2, 9, 8, 7, 6, 3, 4};
        int suma = 0;

        for (int i = 0; i < 7; i++) {
            int digito = Character.getNumericValue(cedula.charAt(i));
            suma += digito * coeficientes[i];
        }

        int resto = suma % 10;
        int verificadorCalculado = (resto == 0) ? 0 : 10 - resto;
        int verificadorOriginal = Character.getNumericValue(cedula.charAt(7));

        if (verificadorCalculado == verificadorOriginal) {
            System.out.println("¿Cédula válida? true");
        } else {
            System.out.println("¿Cédula válida? false");
        }
    }
}
