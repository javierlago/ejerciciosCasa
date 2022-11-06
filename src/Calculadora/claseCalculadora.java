package Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class claseCalculadora {
    private double numero1;

    public double getNumero1(int i) {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    double numero2;
    double resultado;
    boolean repetir;
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
         System.out.println(resultado=numero1+numero2);
    }
    public void resta(){

        System.out.println(resultado=numero1-numero2);
    }
    public void division(){
        System.out.println(resultado=numero1/numero2);
    }
    public void multiplicacion(){
        System.out.println(resultado=numero1*numero2);
    }
    public void decidir()throws IOException {


        do {
            pregunta();
            System.out.println("operacion a realiza 1-suma/2-resta/3-multiplica/4-division");
            String op = br.readLine();
            switch (op) {
                case "1" -> suma();
                case "2" -> resta();
                case "3" -> multiplicacion();
                case "4" -> division();
                default -> System.err.println("introducir una opcion");
            }
           question();



        } while (repetir);


    }
    public void question()throws IOException{
        System.out.print("desea realizar otra operacion s/n");
        String siono = br.readLine();
        repetir = true;
        switch (siono) {
            case "s":
                break;
            case "n":
                repetir = false;
                break;
            default:
                System.err.println("Deber responder s/n");
                repetir=false;
                question();
        }

    }

    }

