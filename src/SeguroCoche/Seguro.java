package SeguroCoche;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seguro {
    String nombre;
    int edad;
    int carnetYear;
    float preciodelcoche;
    double TARIFA=300;
    double tarifafinal = 300;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Seguro() {

    }
    public void pedirTeclado()throws IOException {
        System.out.print("Indicar el nombre del asegurado");
        nombre= br.readLine();
        System.out.print("Indicar la edad");
        String anhos=br.readLine();
        edad = Integer.parseInt(anhos);
        System.out.print("Indicar los años de carnet");
        String anhoscnt=br.readLine();
        carnetYear = Integer.parseInt(anhoscnt);
        System.out.print("Indicar el precio del coche");
        String preciocoche=br.readLine();
        preciodelcoche = Integer.parseInt(preciocoche);


    }
   public void seguro()throws IOException{
        tarifafinal=300;
        if((edad<28 || carnetYear<5)&&(preciodelcoche>15000)){
            tarifafinal=(TARIFA+100)+(TARIFA*0.12);
        } else if (preciodelcoche > 15000) {
            tarifafinal=TARIFA*1.12;
        } else if(edad<28 || carnetYear<5){
            tarifafinal=TARIFA+100;
        } else if (edad>28 && carnetYear>5) {
            tarifafinal=TARIFA;
        }

       Ver v =new Ver();
        v.ver(nombre,tarifafinal);

   }



}


