package PasoValorYPasoReferencia;

public class PrimitivosPorValor {
    public static void main(String [] args) {
        int edadAlumno = 25;
        cambiaredadAlumno(edadAlumno);
        System.out.println(edadAlumno);
    }
    static void cambiaredadAlumno (int edadAlumno) {
        edadAlumno = 20;
    }
}
