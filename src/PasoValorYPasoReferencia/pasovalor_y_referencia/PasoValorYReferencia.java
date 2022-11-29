/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasoValorYPasoReferencia.pasovalor_y_referencia;

/**
 *
 * @author mrnovoa
 */
public class PasoValorYReferencia {

    /**
     * @param args the command line arguments
     */
    
    private String param1 = new String();

 /** Creates a new instance of PassValueOrReference */
    public PasoValorYReferencia(String param1) {
        this.setParam1(param1);
    }

    public static void cambiarObjeto(PasoValorYReferencia objeto) {
        objeto = new PasoValorYReferencia("Este es un nuevo objeto.");
        System.out.println("Luego de \"reasignar\" pass: " + objeto);
    }

    public static void cambiarParam1(PasoValorYReferencia objeto) {
        objeto.setParam1("Este es un nuevo valor para param1.");
    }

    public static void main(String[] args) {
        PasoValorYReferencia pass = new PasoValorYReferencia("Objeto inicial.");
        System.out.println("Entender que Java pasa parámetros por valor: ");
        System.out.println("Antes de modificar pass es: " + pass);
        PasoValorYReferencia.cambiarObjeto(pass);
        System.out.println("De vuelta en main pass es: " + pass);
        System.out.println("Ahora vamos a cambiar sólo param1:");
        PasoValorYReferencia.cambiarParam1(pass);
        System.out.println("De seguro param 1 ha cambiado: " + pass);
        System.out.println("Parece difícil, pero no lo es.");
}

public String getParam1() {
    return param1;
}

public void setParam1(String param1) {
    this.param1 = param1;
}

public String toString() {
    return "[param1 = " + this.getParam1() + "]";
}

}
    

