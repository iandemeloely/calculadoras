package Appjava7;

import java.util.Scanner;

public class Bissexto {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int ano = 0;

        System.out.print("quantos dias tem o seu ano ");
        ano = entrada.nextInt();

        if (ano <= 364){

            System.out.println("voce errou tente novamente");

        }

        if (ano == 366) {

            System.out.println("ano bissexto");
        }

        if (ano == 365) {

            System.out.println("ano normal");
        }
    

    entrada.close();

    }
}

