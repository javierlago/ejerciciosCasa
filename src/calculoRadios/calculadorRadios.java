package calculoRadios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculadorRadios {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double r ;
      double area;
        do {
            System.out.println("Introducir el radio del circulo a calcular");
            String radioin = br.readLine();
            r = Double.parseDouble(radioin);
            if (r==0){
                System.out.println("El radio es cero por lo que no se calcula");
            }
            else{
                    area = ((2*3.14)*r);
                    System.out.println("El area del circulo es "+area);}

        } while (r > 0);


    }
    }
