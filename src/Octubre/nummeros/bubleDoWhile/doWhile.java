package bubleDoWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doWhile {
        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("introducir el valor al que deseas llegar");
            String valor = br.readLine();
            int vl = Integer.parseInt(valor);
            int multiplo =-32;
            do {
                multiplo=multiplo+8;
                System.out.println(multiplo);
            }
            while(multiplo<vl);


        }
}
