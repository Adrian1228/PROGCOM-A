import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> temperatura = Arrays.asList(22, 27, 29, 30, 25, 33);
        List<String> clima = new ArrayList<>();
        for (int x : temperatura) {
            if (x < 26) {
                clima.add(x + "° está frío");
            } else if (x >= 26 && x <= 29) {
                clima.add(x + "° está templado");
            } else {
                clima.add(x + "° está caliente");
            }
        }
        System.out.println("Clima: " + clima);
    }
}
