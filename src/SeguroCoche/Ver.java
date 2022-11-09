package SeguroCoche;

import java.io.IOException;

public class Ver {



    public Ver() {

    }
    public void ver( String nombres ,double tarifa) throws IOException {
        System.out.print("El asegurado "+nombres+ " y su tarifa es de " +tarifa);
    }


}
