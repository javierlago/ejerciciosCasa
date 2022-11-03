package numeroSuerte;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class numSuerte {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introducir el dia de nacimiento");
        String dia = br.readLine();
        int l = dia.length();
        int sumadia = 0;
        for (int i = 0; i < l; i++) {
           String num = String.valueOf(dia.charAt(i));
           sumadia+= Integer.parseInt(num);
        }
        System.out.println("Introducir el mes de nacimiento");
        String fecha = br.readLine();
        int lmes = fecha.length();
        int sumames = 0;
        for(int i= 0 ; i<lmes; i++){
            String nummes=String.valueOf(fecha.charAt(i));
            sumames+=Integer.parseInt(nummes);
        }
        System.out.println("Introducir el año de nacimiento");
        String anho = br.readLine();
        int lanho = anho.length();
        int sumanos = 0;
        for(int i=0; i<lanho;i++ ){
            String numano=String.valueOf(anho.charAt(i));
            sumanos+=Integer.parseInt(numano);
        }

    System.out.println("Su numero de la suerte es  " +(sumames+sumadia+sumanos) );
    }
}
