package Appjava7;

import java.util.Scanner;

public class Desa2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int mnum = 0;

        for (int i = 1; i <= 10;i++) {
        
        System.out.print("informe o numero! ");
        num = entrada.nextInt();

        if (num > mnum){
            
            mnum = num;

            }
            
        }
        System.out.println("o maior numero é " + mnum);
        entrada.close();
    }

}
