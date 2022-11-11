//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ordenador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class principal {
    BufferedReader br;
    private String marcadeordenador;
    private Double precioinicial;
    private byte formadepago;
    private double preciofinal;
    private double mensualidad;

    public String getMarcadeordenador() {

        return this.marcadeordenador;
    }

    public void setMarcadeordenador(String marcadeordenador) {

        this.marcadeordenador = marcadeordenador;
    }

    public Double getPrecioinicial() {

        return this.precioinicial;
    }

    public void setPrecioinicial(Double precioinicial) {

        this.precioinicial = precioinicial;
    }

    public byte getFormadepago() {

        return this.formadepago;
    }

    public void setFormadepago(byte formadepago) {

        this.formadepago = formadepago;
    }

    public principal() {

        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void entradaporteclado() throws IOException {
        System.out.println("Cual es la marca del ordenador");
        marcadeordenador = br.readLine();
        System.out.println("Indique el precio inicial");
        String precio =br.readLine();
        precioinicial = Double.parseDouble(precio);
        System.out.println("Indique forma de pago  1-Pago al contado||2-Pago en 6 meses||3 pago en 12 meses");
        String manera = br.readLine();
        formadepago = Byte.parseByte(manera);
    }

    public void calculo() {
        if (formadepago== 1) {
           precioinicial = preciofinal;
        } else if (formadepago == 2) {
            preciofinal = precioinicial * 1.08;
            mensualidad = preciofinal / 6;
        } else if (formadepago == 3) {
            preciofinal = precioinicial * 1.15;
           mensualidad = preciofinal / 12.;
        }

    }

    public String toString() {
        return "presupuesto" +
                "{marcadeordenador='" + marcadeordenador +
                "', preciofinal=" + preciofinal + "," +
                " mensualidad=" + mensualidad + "}";
    }
}
