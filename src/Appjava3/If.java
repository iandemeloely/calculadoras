package Appjava3;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        
        double nota = 0.0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("informe a nota: ");
        nota = entrada.nextDouble();
        double media = 7.0;

        if (nota >= 0 && nota <= 10) {
                if (nota >= 9.1) {
                    System.out.print("Coceito A\n");
                    System.out.print("Hall da Fama\n");
                }
                else if (nota >= media){
                    System.out.print("Aprovado");
                }
                else if (nota < media){
                    System.err.print("Recuperação");
                }else{
                    System.out.print("Reprovado");
                }
        }
        entrada.close();
    }

    }



