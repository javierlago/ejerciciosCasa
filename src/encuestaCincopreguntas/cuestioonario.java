package encuestaCincopreguntas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cuestioonario {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte npregunta=1;
        int s =0;
        int n =0;
        int NsNc =0;
        for(int i =0;i<5;i++){
        System.out.println("Cual es la respuesta al la pregunta "+npregunta+ "(s/n/NsNc)");
        String respuesta =br.readLine();
        switch(respuesta) {
            case "s":
                s++;
                break;
            case "n":
                n++;
                break;
            case "NsNc":
                NsNc++;
            default:
                System.err.println("Debe de introducir un  valor valido");

        }
        npregunta++;
        }System.out.println("el resultado de la encuesta es si" +((s*100/5))+"%  no" +((n*100/5))+"%  sadNsNc" +((NsNc*100/5))+"%");

    }
}
