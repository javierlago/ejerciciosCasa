package estructuras1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class estructuraPrincipal {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int numero=0,mayordelospares=0,contadordeimpares=0,contadordenumeros=0,acumuladordeimpares=0;

        do{
            System.out.println("Numero");
            String numerointroducido = br.readLine();
            numero = Integer.parseInt(numerointroducido);
            if(positivo(numero)) {
                if (par(numero) && numero>mayordelospares) {
                    mayordelospares=numero;
                } else if (!par(numero)) {
                    contadordeimpares++;
                    acumuladordeimpares=numero+acumuladordeimpares;
                }
            }
        }while(numero>=0);



        System.out.println("media de los impares "+acumuladordeimpares/contadordeimpares);
        System.out.println("el mayor de los numeros pares "+mayordelospares);


    }


    public static boolean par(int n) {
        boolean espar = true;
        if ((n & 2) != 0) {
            espar = false;
        }

        return espar;

    }


        public static boolean positivo(int n){
            boolean noesnegativo=true;
            if(n<0){noesnegativo=false;}
            return noesnegativo;
        }

}










