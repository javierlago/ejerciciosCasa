package PasoValorYPasoReferencia;

public class RefObjInmutables {
/*
El JDK contiene muchas clases inmutables.
Algunos ejemplos son los tipos envolventes Integer, Double, Float, Long, Boolean, BigDecimal y, por supuesto,
la muy conocida clase String.

En el siguiente ejemplo, fíjate en lo que ocurre cuando cambiamos el valor de un String.
* */
    public static void main(String [] args) {

        String name = "";

        CambiarValorString_cambiaraGosling(name);

        System.out.println("El nombre: "+name);

    }

    static void CambiarValorString_cambiaraGosling(String name) {

        name = "Gosling";

    }

}