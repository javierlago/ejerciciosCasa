package toxicidadFuera;

import java.io.IOException;

public class toxico {
    public static void main(String[] args) throws IOException {

        calculotoxico ct =new calculotoxico();
        ct.pedirteclado();
        ct.calculo();
        System.out.println(ct.toString());



    }
}
