import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private static List<Carro> listaCarro = new ArrayList<>();

    public static void estacionarCarro(Carro carro) {
        listaCarro.add(carro);
        System.out.println("Carro: " + carro.getModelo() + " está estacionado");
    }

    public static void mostarCarrosEstacionados() {

        if (listaCarro.size() == 0) {
            System.out.println("\nNão há carros estacionados");
            return;
        }

        System.out.println("\nCarro Estacionado");

        for (Carro carroTemp : listaCarro) {
            carroTemp.mostrarDadosCarro();

        }
    }

    public static void liberarCarro(String placa) {

        for (Carro tempCarro : listaCarro) {
            if (tempCarro.getPlaca().equals(placa)) {

                listaCarro.remove(tempCarro);
                System.out
                        .println("\nCarro " + tempCarro.getModelo() + " ( " + tempCarro.getPlaca() + " ) foi liberado");
                return;
            }
            System.out.println("\nO carro com a placa ( " + placa + " ) não se encontra neste estacionamento ");
        }

    }
}
