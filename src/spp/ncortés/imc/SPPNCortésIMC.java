/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortés.imc;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class SPPNCortésIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        // Paso 1. Declaración de variables (identificadores)
        double W, L, IMC;
        String eIMC;
        //En la siguiente linea, le indico a Java que utilizaré un teclado
        Scanner teclado = new Scanner (System.in);
        //Paso 2. Asignar valores a las variables
        System.out.println("Introduce el peso");
        W=teclado.nextDouble();
        System.out.println("Introduce la estatura");
        L=teclado.nextDouble ();
        //Paso 3. Resolver el problema
        IMC= W/ Math.pow(L, 2);
        //Paso 3.1 Evaluamos IMC
        if (IMC>25){
            eIMC="Sobrepeso";
    }  else if (IMC<19){
            eIMC="Desnutrición";
    }  else {
            eIMC="Normal";
    }
        //Paso 4. Mostrar el resultado.
        System.out.println("Peso =" +  W);
        System.out.println("Estatura=" +  L);
        System.out.println("IMC=" +  IMC);
        System.out.println(eIMC);
    }
    
}
