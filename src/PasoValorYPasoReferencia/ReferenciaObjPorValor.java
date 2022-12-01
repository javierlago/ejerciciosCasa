package PasoValorYPasoReferencia;

public class ReferenciaObjPorValor {
    public String name;
    public String surname;

    public static void main(String []  args) {
        Actor a1 = new Actor();
        a1.name="Ryan";
        a1.surname="Reynolds";
        transformaraGosling(a1);
        System.out.println(a1.name+" "+a1.surname);
        ReferenciaObjPorValor rf = new ReferenciaObjPorValor();
        rf.name="Jose";
        rf.surname="Gonzalez";
        System.out.println(rf.name+rf.surname);
        cambion(rf);
        System.out.println(rf.name+rf.surname);

    }
    static void transformaraGosling (Actor objeto) {
        objeto.surname = "Gosling";


   /*  ReferenciaObjPorValor rf = new ReferenciaObjPorValor();
     rf.name="Jose";
     rf.surname="Gonzalez";
     System.out.println(rf.name+rf.surname);
     cambion(rf);
     System.out.println(rf.name+rf.surname);*/





        }
    public static void cambion (ReferenciaObjPorValor objeto){
        objeto.name="Manolo";
        objeto.surname="Perez";



    }
}
class Actor {
    String name;
    String surname;
}
