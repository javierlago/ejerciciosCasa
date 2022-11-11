package ejercicioVehiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainVehiculo {


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("marca?");
        String caca= br.readLine();
        vehiculo v = new vehiculo(caca);



    }
    public  void pedirtipo()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Indicar el tipo de coche");
        vehiculo.tipo = br.readLine();
    }


}
