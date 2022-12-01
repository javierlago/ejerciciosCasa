package numerosPares;



import java.io.IOException;

import Metodos.Mismetodos;


public class pareado {





    public static void main(String[] args)throws IOException {

        int numero1;
        int numero2;
        int contador = 0;
        int i;
        do {

        numero1 = Mismetodos.pedirNumero();
        numero2 = Mismetodos.pedirNumero();
        for (i = numero1; i <= numero2; i++)
            if (Mismetodos.espar(i)) {
                System.out.print(i + "\n");
                contador++;
            }

    }while(Mismetodos.repetirproceso());
        System.out.print("El total de numeros pares "+contador);
    }
}
