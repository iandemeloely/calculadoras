package Jair;

import java.util.Scanner;

public class NotasEscola {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        float notas[] = new float[5];
        String aluno, resultado;

        System.out.println(".: Notas Escolares :.");
        System.out.print("Informe o nome do aluno ");
        aluno = ler.next();

        aluno = aluno.substring(0,1).toUpperCase().concat(aluno.substring(1));

        for (int i = 0; i < 4; i++) {

            System.out.println("informe a " + (i+1) + "ª nota ");
            notas[i] = ler.nextFloat();
            // notas[4] = notas [4] + notas [i]
            notas[4] += notas [i];

        }

        notas[4] = notas[4] / 4;

        if (notas[4] >= 7){

            resultado = "Aprovado";
        
        }else{

            resultado = "Reprovado";
        }

        System.out.println("o aluno(a) " + aluno + " teve a média " + notas[4] + " e foi " + resultado + ".");

        ler.close();
    }

}
