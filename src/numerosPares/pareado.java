package numerosPares;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Metodos.Mismetodos;


public class pareado {





    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero1;
        int numero2;
        int contador = 0;
        int i;
        do {

        numero1 = Mismetodos.pedirNumero();
        numero2 = Mismetodos.pedirNumero();
       /* System.out.println("introducir primer numero");
        String num =br.readLine();
        numero1=Integer.parseInt(num);*/
        /*System.out.println("introducir segundo numero");
        String num2 =br.readLine()*/
        ;

        for (i = numero1; i <= numero2; i++) {
            if (Mismetodos.espar(i)) {
                System.out.print(i + "\n");
                contador++;
            }
        }
        /*Mismetodos.repetirproceso()*/;
    }while(Mismetodos.repetirproceso());
        System.out.print("El total de numeros pares "+contador);
    }
}
