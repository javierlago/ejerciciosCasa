package PasoValorYPasoReferencia.simulacionPasoRef;

class ArrayUnElto{
    public static void main (String [] arguments)
    {
        // single element array.
        int number[] = { 1 };

        // imprimir antes del update
        System.out.println("número en posición 0 antes = " + number[0]);

        // método update.
        update(number);

        // imprimir después del update
        System.out.println("número en posición 0 modificado = " + number[0]);
    }

// método update
    public static void update( int [] number){//también int number[]
    // incrementa el número.
        number[0]++;
    }

}