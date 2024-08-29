package Jair;

import java.util.Scanner;

public class NotasEscolaresVM {

    /**
     *criar algoritimo para receber notas de 5 alunos de 4 bimestres
    *a freq do aluno e apresentar o resltado final conciderando
    *média >= 7 e freq. >= 75%
    */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String alunos[][] = new String[5][2];
        float notas [][] = new float [5][6];
        
        System.out.println(".: Notas Escolares 2 :.");
        for (int i = 0; i < 5; i++){
            System.out.print("Informe o nome " + (i+1) + "° Aluno ");
            alunos[i][0] = ler.next();
            for ( int j = 0; j < 4; j++){
                System.out.print("digite a " + (j+1) + "ª nota: ");
                notas[i][j] = ler.nextFloat();
                notas[i][5] += notas[i][j]; // acumula notas
            }//fim for notas
            notas[i][5] = notas[i][5] / 4;
            System.out.print("Digite a Frequancia do aluno " + alunos[i][0] + ": ");
            notas[i][4] = ler.nextFloat();
            if (notas[i][4] < 75 ) {
                alunos[i][1] = "reprovado por falta";
            }else if (notas [i][5] < 7) {
                alunos[i][1] = "Reprovado por nota";
            }else {
                alunos[i][1] = "aprovado";
            }
            System.out.println("-----------");
        }// fim do for
        
        for (int i = 0; i < 5; i++){

            System.out.println("o aluno " + alunos[i][0] + " teve a média de " + notas[i][5] + " frequencia: " + notas[i][4] + " e foi "+ alunos[i][1] + ".");
        }
        System.out.println("sistema encerrado");

        ler.close();
        }

}
