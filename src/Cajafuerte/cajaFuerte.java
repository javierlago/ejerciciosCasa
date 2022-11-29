package Cajafuerte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cajaFuerte {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numerocaja=1111,numerointroducido=0;
        int oportunidades=4;
        boolean acierto = false;
        while(oportunidades>0 && acierto==false ){
            do{
            System.out.println("Introducir el numero secreto");
            String numerosecreto= br.readLine();
            numerointroducido=Integer.parseInt(numerosecreto);
                if (numerointroducido == numerocaja) {acierto=true;
                }
                if(!cuatrodigitos(numerointroducido)){
                System.out.println("El numero debe contener solo 4 digitos");
            }
          }while(!cuatrodigitos(numerointroducido));



            oportunidades--;

        }
        if(oportunidades==0){
            System.out.println("Lo siento pero no has acertado");
        } else if (acierto=true) {
            System.out.println("Enhorabuena has acertado");







    }

}
    public static boolean cuatrodigitos(int n){
        boolean tienecuatro=true;
        if(n<1000 || n>=9999){
            tienecuatro=false;
        }


        return tienecuatro;
    }


}