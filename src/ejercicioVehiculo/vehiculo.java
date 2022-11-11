package ejercicioVehiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vehiculo {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String modelo;
    private String marca;
    private String color;
    private String combustible;

    private int cilindrada;
    private int matricula;
    private int diamatriculacion;


    public static String tipo;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getDiamatriculacion() {
        return diamatriculacion;
    }

    public void setDiamatriculacion(int diamatriculacion) {
        this.diamatriculacion = diamatriculacion;
    }




    public vehiculo(String modelo) {
    }

    public vehiculo() {
    }

    public void show()throws IOException {
        System.out.println(modelo);
        System.out.println(marca);
        System.out.println(cilindrada);
        System.out.println(color);
        System.out.println(combustible);
        System.out.println(matricula);
        System.out.println(diamatriculacion);

    }
    public void teclado(){
        System.out.print();




    }
}
