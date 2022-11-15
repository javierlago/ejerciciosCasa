package ejercicioVehiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainVehiculo {


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("mmodelo?");
        String mod= br.readLine();
        System.out.println("marca?");
        String marca = br.readLine();
        System.out.println("color?");
        String color = br.readLine();
        System.out.println("combustible?");
        String combustible = br.readLine();
        System.out.println("cilindrada?");
        String cilindrada = br.readLine();
        int cilin= Integer.parseInt(cilindrada);
        System.out.println("matricula?");
        String matricula= br.readLine();
        int mat= Integer.parseInt(matricula);
        System.out.println("dia de matricula?");
        String diamatricula= br.readLine();
        int diamat= Integer.parseInt(diamatricula);

        vehiculo coche1 = new vehiculo(mod,marca,color,combustible,cilin,mat,diamat);
        vehiculo coche2 = new vehiculo();
        System.out.print("mmodelo?");
        coche2.setModelo(br.readLine());
        System.out.println("marca?");
        coche2.setMarca(br.readLine());
        System.out.println("color?");
        coche2.setColor(br.readLine());
        System.out.println("combustible?");
        coche2.setCombustible(br.readLine());
        System.out.println("cilindrada?");
        coche2.setCilindrada(Integer.parseInt(br.readLine()));
        System.out.println("matricula?");
        coche2.setMatricula(Integer.parseInt(br.readLine()));
        System.out.println("dia de matricula?");
        coche2.setDiamatriculacion(Integer.parseInt(br.readLine()));

        vehiculo coche3 = new vehiculo("caraca","marca3","color","jasoil",45,14578,15546);
        System.out.println("Datos del coche 1");
        coche1.show();
        System.out.println("Datos del coche 2");
        coche2.show();
        System.out.println("Datos del coche 3");
        coche3.show();


    }

/*    public  void pedirtipo()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Indicar el tipo de coche");
        vehiculo.tipo = br.readLine();
    }*/


}
