package numerosUnoCien;

public class numerosUnocienWhile {
    public static void main(String[] args){
        byte numero=0;
        while(numero<=100){
            if(numero %2 ==0 && numero % 3==0 || numero==100) {
                System.out.println(numero);
            }
            numero++;
            }

        }

    }

