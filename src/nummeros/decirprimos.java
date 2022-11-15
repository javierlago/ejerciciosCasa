package nummeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class decirprimos {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introducir numero");
        String num = br.readLine();
        int nn = Integer.parseInt(num);
        int contador = 0;
        np(nn);
        if(np(nn)==true){
            contador++;

        }
        System.out.println(contador);






    }


    public static boolean np(int nn) {
        int
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



