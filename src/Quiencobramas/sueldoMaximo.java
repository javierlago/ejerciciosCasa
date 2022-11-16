package Quiencobramas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.*;

public class sueldoMaximo {
        static int salario=0;
        static int salariomax=0;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Numero de salarios");
        String numsalarios = br.readLine();
        int ns = parseInt(numsalarios);
        for (int i = 0; i < ns; i++) {
            System.out.println("introducir salarios");
            String sal = br.readLine();
            salario = parseInt(sal);
            if (salario > salariomax) {
                salario = salariomax;

            }


        }
        System.out.println("El salario maximo es " + salariomax);
    }
}
