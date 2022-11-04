package calculoRadios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystemAlreadyExistsException;

public class radiosConrepetir {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r ;
        double area;
        boolean repetir= true;
        do {
            do {
                System.out.println("Introducir el radio del circulo a calcular");
                String radioin = br.readLine();
                r = Double.parseDouble(radioin);
                if (r == 0) {
                    System.out.println("El radio es cero por lo que no se calcula");
                } else {
                    area = ((2 * 3.14) * r);
                    System.out.println("El area del circulo es " + area);
                }
                System.out.println("Desea repetir el proceso (s/n)");
                String respuesta = br.readLine();
                        switch(respuesta){

                            case "s":
                        break;
                            case "n":
                        repetir=false;
                        r=0;
                }
            }while (repetir);
        } while (r > 0);

    System.out.println("Gracias por confiar en nuestro sistema de calculo de radios");
    }
}