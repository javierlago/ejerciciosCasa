package Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class claseCalculadora {
    double numero1;
    double numero2;
    double resultado;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public claseCalculadora(){

    }
    public void pregunta()throws IOException{
        System.out.print("Introduce el primer numero");
        String primero= br.readLine();
        numero1= Double.parseDouble(primero);
        System.out.print("Introducir el segundo numero");
        String segundo = br.readLine();
        numero2= Double.parseDouble(segundo);
    }
    public void suma(){
         resultado=numero1+numero2;
    }
    public void resta(){
        resultado=numero1-numero2;
    }
    public void division(){
        resultado=numero1/numero2;
    }
    public void multiplicacion(){
        resultado=numero1*numero2;
    }
    public void decidir()throws IOException {
        boolean repetir=true;
        do{
            System.out.println("operacion a realiza 1-suma/2-resta/3-multiplica/4-division");
            String op = br.readLine();
            switch (op) {
                case "1":
                    suma();
                    break;
                case "2":
                    resta();
                    break;
                case "3":
                    multiplicacion();
                    break;
                case "4":
                    division();
                    break;
                default:
                    System.err.println("introducir una opcion");


            }
            System.out.print("desea realizar otra operacion s/n");



        }while(repetir=true);


        }

    }

