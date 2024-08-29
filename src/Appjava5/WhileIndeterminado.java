package Appjava5;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while (valor.equalsIgnoreCase     ("Sair") ) {
            System.out.println("Você escolheu");
            valor = entrada.nextLine();
        }

        entrada.close();
    }

}
