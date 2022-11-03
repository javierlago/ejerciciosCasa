package programaVentas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class programaVentas {
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introducir el nuemero de ventas");
        String numerodeventas = br.readLine();
        int nv = Integer.parseInt(numerodeventas);




    }
}
