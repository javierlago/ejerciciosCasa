package divisiblesDosyTres;

public class divisibles {
    public static void main(String [] args){
        int numero;
        for (numero=1;numero<=100;numero++){
            if((numero % 2 == 0 && numero % 3 == 0)|| numero==100 )
                System.out.println(numero);


        }


    }
}
