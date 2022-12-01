package PasoValorYPasoReferencia;

public class RefObjMutable
{
    /*
    * A diferencia de String, la mayoría de los objetos del JDK son mutables, como la clase StringBuilder.
    * El ejemplo siguiente es similar al anterior, pero presenta StringBuilder en lugar de String:
    * */

        public static void main(String [] args) {

            StringBuilder name = new StringBuilder("James ");

            agregarApellido(name);

            System.out.println(name);

        }

        static void agregarApellido(StringBuilder name) {

            name.append("Gosling");

        }

    }


