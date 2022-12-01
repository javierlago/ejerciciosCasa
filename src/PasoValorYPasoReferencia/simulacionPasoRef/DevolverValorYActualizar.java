package PasoValorYPasoReferencia.simulacionPasoRef;

// método principal

class DevolverValorYActualizar{

    public static void main (String [] arguments)

    {

        int number = 1;

        // impresión antes de la actualización.

        System.out.println("número = " + number);

        // La función update devuelve un valor.

        number = update(number);

        // impresión después del update

        System.out.println("número actualizado= " + number);

    }

// método update

    public static int update( int number ){

        // incrementa el número.

        number++;

        return number;

    }

}