package numerosPares;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Metodos.Mismetodos;


public class pareado {





    public static void qmain(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int numero1;
        int numero2;
        int contador=0;
        int i;
        System.out.println("introducir primer numero");
        String num =br.readLine();
        numero1=Integer.parseInt(num);
        System.out.println("introducir segundo numero");
        String num2 =br.readLine();
        numero2=Integer.parseInt(num2);
        for(i=numero1; i<=numero2; i++){
            if(Mismetodos.espar(i)){
                System.out.print(i+"\n");
               contador++;
            }
        }
        System.out.print("El total de numeros pares "+contador);
    }
}
