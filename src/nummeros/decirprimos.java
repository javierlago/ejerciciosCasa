package nummeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decirprimos {
    public static void main(String[] args) throws IOException {

        contar();

    }
    public static void contar()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int contadorPrimos=0;
        do{System.out.println("Introducir numero");
            String numeroooo = br.readLine();
            numero = Integer.parseInt(numeroooo);
            if(numero<0){
                System.out.println("Debes introducir un numero positivc");
            }
        }while(numero<0);

        for(int i=numero;i>0;i--){
            if(np(i)){
                System.out.print(i+ "es primo\n");
                contadorPrimos++;
            }

        }
    }
    public static boolean np(int nn) {
        int contadorPrimos = 0;
        boolean primo= true;
        int c=nn-1;
        while(primo && c>1){ // for(int c=numero-1;primo && c>1;c--)
            if (nn%c==0) {
                primo=false;
            }
            c--;
        }
        return primo;
    }
}



