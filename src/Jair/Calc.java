package Jair;

import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {
        
        float altura, imc, peso = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Calculadora de IMC:");

        System.out.println("digite a sua altura ");
        altura = ler.nextFloat();
        System.out.println("informe o seu peso");
        peso = ler.nextFloat();
        //(float) (peso / math.pow(altura, 2));
        imc = peso / (altura * altura);

        System.out.println("o seu imc e de "+ imc);

        if (imc > 40) {

            System.out.println("obesidade grau 3");
            
        }

        else if (imc >= 35 && imc <=40) {

            System.out.println("obesidade grau 2");
            
        }

        else if (imc >= 30 && imc <= 39.9) {

            System.out.println("obesidade grau 1");
            
        }

        else if (imc >= 25 && imc <= 29.9) {

            System.out.println("sobrepeso");
            
        }

        else if (imc >= 18.5 && imc <= 24.9) {

            System.out.println("peso normal");
            
        }

        else if (imc >= 17 && imc <= 18.4) {

            System.out.println("abaixo do peso");
            
        }

        else {

            System.out.println("muito abaixo do peso");
            
        } //fim main

        
        
        ler.close();
        
        
        }
        /**
         * calcula o imc
         * @param altura
         * @param peso
         * @return
         */
    public static float calcIMC(float altura,float peso){

        return peso / (altura * altura) ;
    
    
    }
}
