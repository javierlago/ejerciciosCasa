package Metodos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mismetodos {
    public static void main(String[] args) {

    }
    public static boolean espar (int n){
        return n % 2 == 0;
    }
    public static boolean espositivo(int n){
        return n >= 0;
    }
    public static void responder(String reps) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Desea repetir la operacion");

        reps = br.readLine();
        if ((reps != "S") || reps!="s"){

        }

    }

}