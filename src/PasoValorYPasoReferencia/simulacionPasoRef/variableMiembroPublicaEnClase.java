package PasoValorYPasoReferencia.simulacionPasoRef;

// mi clase

class variableMiembroPublicaEnClase {

// variable miembro pública

    public int numero;

// constructor por defecto

    public variableMiembroPublicaEnClase()
    {
        numero = 1;
    }
}

// método principal

class Main{

    public static void main (String [] arguments) {

    // creación objeto

        variableMiembroPublicaEnClase object = new variableMiembroPublicaEnClase();

    // imprimir antes del update

        System.out.println("número = " + object.numero);

    // método update llamado

        update(object);

// imprimir después del update

        System.out.println("número = " + object.numero);

    }

// método update

    public static void update( variableMiembroPublicaEnClase obj ){

// incrementa la variable número.
        obj.numero++;
    }
}
