package Appjava7;

import java.util.Scanner;

public class Desa3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int soma = 0;

        /*System.out.print("informe o numero! ");
        num = entrada.nextInt();
        soma += num;


        while (num > 0) {
            System.out.print("informe o numero! ");
        num = entrada.nextInt();

        if (num >= 0) {

            soma = soma + num;
            
        }
        
*/
            do {

                System.out.print("informe o numero! ");
            num = entrada.nextInt();

            if (num >= 0) {

                soma = soma + num;
                
            }
                
            } while (num > 0);
            System.out.println("o resultado final e " + soma);
    
            entrada.close();
            
        }


    }

