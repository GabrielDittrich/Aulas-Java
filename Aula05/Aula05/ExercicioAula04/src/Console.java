import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        return valor;
    }

    public static float lerFloar() {
        float valor = leitor.nextFloat();
        return valor;
    }

}
