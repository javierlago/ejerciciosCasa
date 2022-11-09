package toxicidadFuera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class calculotoxico {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nivel;
    String mensaje;
    String nombre;
    public calculotoxico() {
    }

    public  void pedirteclado() throws IOException {
        System.out.print("Introducir el nombre del producto");
        nombre= br.readLine();
        System.out.println("Introducir el nivel de toxicidad");
        String toxiciy=br.readLine();
        nivel=Integer.parseInt(toxiciy);
    }

    public void calculo(){

        if (nivel <=10){
            mensaje="No toxico" ;
        } else if(nivel==11) {
            mensaje="Baja toxicidad";
        } else if (nivel==12) {
            mensaje="Media toxicidad";
        } else if (nivel==13) {
            mensaje="Alta toxicidad";
        } else if (nivel>13) {
            mensaje="Altamente peligroso";
        }

    }

    @Override
    public String toString() {
        return "La toxicidad del producto " +nombre+ " es  " +mensaje;
    }
}