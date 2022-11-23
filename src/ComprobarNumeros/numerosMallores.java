package ComprobarNumeros;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numerosMallores {
    public static void main(String[] args)throws IOException {
        int numero;
        int contpos=0;
        int conneg=0;
        int contadordeceros=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Numeros a introducir?");
        String numerosain=br.readLine();
        int nin = Integer.parseInt(numerosain);

        for(int i = 0; i<nin; i++){
            System.out.println("introducir el numero");
            String numeroleido = br.readLine();
            numero=Integer.parseInt(numeroleido);
            if(!negativo(numero) &&(!positivo(numero))){
                contadordeceros++;
            } else if (negativo(numero)) {
                conneg++;
            } else{
                contpos++;

            }


        }
        System.out.println("El numero de negativos es de "+conneg+ "\nLosnumero positivos son" +contpos+ "\nEl contador de 0 es de "+contadordeceros);
    }
   public static boolean positivo(int numero){
       return numero > 0;
    }
    public static boolean negativo(int numero){
        return numero < 0;
    }
}
