package programaVentas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class programaVentas {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introducir el nuemero de ventas");
        String numerodeventas = br.readLine();
        int nv = Integer.parseInt(numerodeventas);
        int total = 0;
        byte contadorventas =1;
        for (int i = 0; i < nv; i++) {
            System.out.println("Introduzca el valor de la venta nº "+contadorventas);
            String sumadeventas = br.readLine();
            int sv = Integer.parseInt(sumadeventas);
            total = (total + sv);
            contadorventas++;
        }
        System.out.println("El numero valor de las ventas realizadas es "+total);
    }
}
