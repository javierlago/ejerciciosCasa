package SeguroCoche;

import java.io.IOException;

public class Principalseguro {
    public static void main(String[] args) throws IOException {

        Seguro s = new Seguro();
        s.pedirTeclado();
        s.seguro();
        System.out.print(s.TARIFA);
    }
}
