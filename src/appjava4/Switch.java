package appjava4;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe o codigo da fruta: ");
        int fruta = entrada.nextInt();
        

        if (fruta >= 0 && fruta <= 50){
            switch (fruta) {
                case 10:
                    System.out.println("Laranja");
                    break;
                case 20:
                System.out.println("Maça");
                    break;
                case 30:
                System.out.println("Banana");
                    break;
                case 40:
                System.out.println("Uva");
                    break;
                case 50:
                System.out.println("Ameixa");
                    break;
            }
            
        }else{
            System.out.println("Erro tente novamente!");
        }
        entrada.close();
    }
}
