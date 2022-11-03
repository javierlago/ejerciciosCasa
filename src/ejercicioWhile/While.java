package ejercicioWhile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introducir el numero de alumnos a comprobar");
        String alumnos = br.readLine();

        int nalumnos = Integer.parseInt(alumnos);
        int contador = 0;
        while (nalumnos>contador){
            System.out.println("Medida del alumno");
            String medida = br.readLine();
            int med = Integer.parseInt(medida);
            System.out.println( "La medida del alumno es " +med);
            contador = contador +1;

        }



    }
}