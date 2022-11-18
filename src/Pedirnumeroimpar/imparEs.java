package Pedirnumeroimpar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class imparEs {
    public static void main(String[] args) throws IOException {

        int numero = 0;
        int sumadepares=0;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Numero?");
            String elnum = br.readLine();
            numero = Integer.parseInt(elnum);
           if(numero%2==0){
               sumadepares=numero+sumadepares;}

        }while(numero%2==0);

    System.out.println("El progama se ha acabado\nLa suma de los pares es "+sumadepares);
    }

}
