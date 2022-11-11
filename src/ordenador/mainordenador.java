package ordenador;

import java.io.IOException;

public class mainordenador {
    public static void main(String[] args) throws IOException {

        principal p = new principal();
        p.entradaporteclado();
        p.calculo();
        System.out.println(p.toString());

    }
}
