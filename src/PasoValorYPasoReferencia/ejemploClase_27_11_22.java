package PasoValorYPasoReferencia;

public class ejemploClase_27_11_22 {
    public static String nombre="";//pueden ser static o no
    public static int numero=0;//pueden ser static o no

    public static String nombre_s="";//pueden ser static o no
    public static int numero_s=0;//pueden ser static o no

    public static void main(String[] args) {
        ejemploClase_27_11_22 ejc= new ejemploClase_27_11_22();

        //No static
        System.out.println("- NO STATIC -");
        System.out.println("Valores ANTES:");
        ejc.VisualizarValores();

        ejc.CambioValores();

        System.out.println("Valores DESPUÉS:");
        ejc.VisualizarValores();

        //static
        System.out.println("- STATIC -");
        System.out.println("Valores ANTES:");
        ejemploClase_27_11_22.VisualizarValores_Static();

        ejemploClase_27_11_22.CambioValores_Static();

        System.out.println("Valores DESPUÉS:");
        ejemploClase_27_11_22.VisualizarValores_Static();
    }
    public void VisualizarValores(){
        System.out.println("nombre - "+nombre);
        System.out.println("número - "+numero);
    }

    public void CambioValores(){
        nombre=nombre+"es el valor concatenado";
        numero=numero+100;
    }

    public static void VisualizarValores_Static(){
        System.out.println("nombre - "+nombre_s);
        System.out.println("número - "+numero_s);
    }

    public static void CambioValores_Static(){
        nombre_s=nombre_s+"es el valor concatenado";
        numero_s=numero_s+100;
    }

}
