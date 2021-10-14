package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaTurma = new Scanner(System.in);
        Scanner entradaChamada = new Scanner(System.in);

        int qtdTurma = 0, alunosMatri, numMatri, alunos = 0;
        double qtdA = 0, qtdP = 0, porP, turmasAcima10Por = 0;
        String turma = null, chamada;

        while(qtdTurma < 5){
            System.out.println("Informe a turma: ");
            turma=entrada.next();
            System.out.println("Informe o número de alunos matriculados: ");
            alunosMatri=entrada.nextInt();

            while(alunos < alunosMatri){
                System.out.println("Informe o número de matricula do aluno: ");
                numMatri=entrada.nextInt();
                System.out.println("Informe A para aluno ausênte e P para aluno PRESENTE: ");
                chamada=entrada.next();

                if (chamada.equals("P")){
                    qtdP++;
                }else{
                    qtdA++;
                }

                alunos++;

            }
            porP = (qtdP/alunos)*100;
            if(porP > 10){
                turmasAcima10Por++;
            }
            System.out.println("Turma: "+ turma);
            System.out.println("Porcentagem de alunos presentes: " + porP + "%\n");

            porP=0;
            qtdP=0;
            alunos=0;
            qtdA=0;
            qtdTurma++;
        }
        System.out.println("Turmas com a porcentagem de presença acima de 10% " + turmasAcima10Por);
    }

}


