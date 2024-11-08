package com.example.trabalho2obimestre.helper;

import android.database.sqlite.SQLiteDatabase;

public class SeedData {

    public static void insertInitialData(SQLiteDatabase db){
        db.execSQL("INSERT INTO TURMA (nomeTurma, anoLetivo) VALUES " +
                "('1A', 2024), ('1B', 2024), ('2A', 2024), ('2B', 2024), ('3A', 2024), ('3B', 2024)");

        db.execSQL("INSERT INTO ALUNO (nome, cpf, turmaId) VALUES " +
                "('João Silva', '987.654.321-00', 1)," +
                "('Maria Oliveira', '123.456.789-01', 1)," +
                "('Ana Costa', '123.456.789-03', 1)," +
                "('Pedro Santos', '987.654.321-02', 1)," +
                "('Lucas Lima', '987.654.321-04', 1)," +
                "('Beatriz Souza', '123.456.789-05', 1)," +
                "('Felipe Fernandes', '987.654.321-06', 1)," +
                "('Larissa Almeida', '123.456.789-07', 1)," +
                "('Ricardo Pereira', '987.654.321-08', 1)," +
                "('Juliana Rodrigues', '123.456.789-09', 1)," +
                "('Ana Souza', '123.456.789-09', 1)," +
                "('Larissa Rodrigues', '123.456.789-09', 1)," +
                "('João Pedro', '123.456.789-03', 1)," +
                "('Carlos Henrique', '987.654.321-20', 3)," +
                "('Fernanda Ribeiro', '123.456.789-21', 3)," +
                "('Gustavo Andrade', '987.654.321-22', 3)," +
                "('Patrícia Mendes', '123.456.789-23', 3)," +
                "('Rafael Moraes', '987.654.321-24', 3)," +
                "('Camila Torres', '123.456.789-25', 3)," +
                "('Eduardo Nascimento', '987.654.321-26', 3)," +
                "('Aline Barros', '123.456.789-27', 3)," +
                "('Marcos Ferreira', '987.654.321-28', 3)," +
                "('Vanessa Martins', '123.456.789-29', 3)");

        db.execSQL("INSERT INTO PROFESSOR (nome, cpf) VALUES ('Clara Martins', '123.456.789-00')");

        db.execSQL("INSERT INTO DISCIPLINA (nome, professorRegistro) VALUES ('Matemática', 1)");

        db.execSQL("INSERT INTO TURMA_DISCIPLINA (disciplinaId, turmaId) " +
                "VALUES (1, 1), (1, 3)");

        //Aparentemente tem um limite de inserts que podem ser feitos de uma unica vez.
        //Tentei replicar o método para inserir aos poucos, mas não consegui.
        //Se você olhar a tabela ele só inseriu 50 registros.
        db.execSQL("INSERT INTO NOTA (anoLetivo, bimestre, notaTrabalho, notaAvaliacao, alunoMatricula, disciplinaId) VALUES " +
                //Aluno 1
                "(2024, '1', 8.5, 7.0, 1, 1)," +
                "(2024, '2', 8.8, 8.8, 1, 1)," +
                "(2024, '3', 6.2, 5.0, 1, 1)," +
                "(2024, '4', 9.1, 7.0, 1, 1)," +

                //Aluno 2
                "(2024, '1', 7.4, 6.5, 2, 1)," +
                "(2024, '2', 7.9, 8.0, 2, 1)," +
                "(2024, '3', 8.1, 7.5, 2, 1)," +
                "(2024, '4', 9.0, 7.8, 2, 1)," +

                //Aluno 3
                "(2024, '1', 9.0, 6.7, 3, 1)," +
                "(2024, '2', 8.3, 7.1, 3, 1)," +
                "(2024, '3', 8.5, 7.2, 3, 1)," +
                "(2024, '4', 7.6, 6.9, 3, 1)," +

                //Aluno 4
                "(2024, '1', 8.6, 7.3, 4, 1)," +
                "(2024, '2', 8.2, 7.9, 4, 1)," +
                "(2024, '3', 7.1, 6.8, 4, 1)," +
                "(2024, '4', 7.9, 6.4, 4, 1)," +

                //Aluno 5
                "(2024, '1', 8.1, 7.2, 5, 1)," +
                "(2024, '2', 7.4, 7.8, 5, 1)," +
                "(2024, '3', 6.8, 6.9, 5, 1)," +
                "(2024, '4', 8.7, 7.5, 5, 1)," +

                //Aluno 6
                "(2024, '1', 7.3, 6.8, 6, 1)," +
                "(2024, '2', 7.9, 7.0, 6, 1)," +
                "(2024, '3', 8.0, 6.7, 6, 1)," +
                "(2024, '4', 7.5, 7.1, 6, 1)," +

                //Aluno 7
                "(2024, '1', 8.4, 7.4, 7, 1)," +
                "(2024, '2', 8.0, 6.8, 7, 1)," +
                "(2024, '3', 6.9, 7.3, 7, 1)," +
                "(2024, '4', 8.8, 7.2, 7, 1)," +

                //Aluno 8
                "(2024, '1', 7.8, 6.7, 8, 1)," +
                "(2024, '2', 7.5, 6.9, 8, 1)," +
                "(2024, '3', 8.3, 7.5, 8, 1)," +
                "(2024, '4', 8.7, 7.4, 8, 1)," +

                //Aluno 9
                "(2024, '1', 8.1, 6.9, 9, 1)," +
                "(2024, '2', 7.9, 7.4, 9, 1)," +
                "(2024, '3', 8.4, 7.8, 9, 1)," +
                "(2024, '4', 7.6, 6.9, 9, 1)," +

                //Aluno 10
                "(2024, '1', 8.5, 7.1, 10, 1)," +
                "(2024, '2', 8.3, 7.3, 10, 1)," +
                "(2024, '3', 7.8, 6.8, 10, 1)," +
                "(2024, '4', 9.0, 7.7, 10, 1)," +

                //Aluno 11
                "(2024, '1', 7.6, 6.9, 11, 1)," +
                "(2024, '2', 8.4, 7.1, 11, 1)," +
                "(2024, '3', 8.9, 7.3, 11, 1)," +
                "(2024, '4', 7.7, 6.7, 11, 1)," +

                //Aluno 12
                "(2024, '1', 8.2, 7.0, 12, 1)," +
                "(2024, '2', 7.9, 6.8, 12, 1)," +
                "(2024, '3', 8.3, 7.2, 12, 1)," +
                "(2024, '4', 7.5, 7.0, 12, 1)," +

                //Aluno 13
                "(2024, '1', 9.1, 7.4, 13, 1)," +
                "(2024, '2', 8.7, 7.6, 13, 1)," +
                "(2024, '3', 7.3, 6.5, 13, 1)," +
                "(2024, '4', 8.4, 7.2, 13, 1)," +

                //Alunos da Turma 3
                //Aluno 14
                "(2024, '1', 7.8, 6.7, 14, 3)," +
                "(2024, '2', 8.5, 7.2, 14, 3)," +
                "(2024, '3', 6.9, 7.0, 14, 3)," +
                "(2024, '4', 7.6, 6.8, 14, 3)," +

                //Aluno 15
                "(2024, '1', 8.2, 7.5, 15, 3)," +
                "(2024, '2', 7.6, 6.9, 15, 3)," +
                "(2024, '3', 8.1, 7.4, 15, 3)," +
                "(2024, '4', 8.5, 7.1, 15, 3)," +

                //Aluno 16
                "(2024, '1', 8.3, 7.8, 16, 3)," +
                "(2024, '2', 7.8, 6.8, 16, 3)," +
                "(2024, '3', 8.7, 7.3, 16, 3)," +
                "(2024, '4', 7.9, 6.7, 16, 3)," +

                //Aluno 17
                "(2024, '1', 8.1, 7.1, 17, 3)," +
                "(2024, '2', 7.5, 6.5, 17, 3)," +
                "(2024, '3', 8.4, 7.0, 17, 3)," +
                "(2024, '4', 7.8, 7.2, 17, 3)," +

                //Aluno 18
                "(2024, '1', 7.9, 6.7, 18, 3)," +
                "(2024, '2', 8.6, 7.4, 18, 3)," +
                "(2024, '3', 8.0, 7.6, 18, 3)," +
                "(2024, '4', 7.5, 6.8, 18, 3)," +

                //Aluno 19
                "(2024, '1', 7.2, 6.4, 19, 3)," +
                "(2024, '2', 8.1, 7.3, 19, 3)," +
                "(2024, '3', 8.3, 7.0, 19, 3)," +
                "(2024, '4', 8.0, 6.9, 19, 3)," +

                //Aluno 20
                "(2024, '1', 7.8, 6.9, 20, 3)," +
                "(2024, '2', 8.5, 7.1, 20, 3)," +
                "(2024, '3', 8.7, 7.2, 20, 3)," +
                "(2024, '4', 7.6, 6.5, 20, 3)," +

                //Aluno 21
                "(2024, '1', 8.4, 7.2, 21, 3)," +
                "(2024, '2', 7.8, 6.8, 21, 3)," +
                "(2024, '3', 8.2, 7.3, 21, 3)," +
                "(2024, '4', 8.0, 7.4, 21, 3)," +

                //Aluno 22
                "(2024, '1', 7.7, 6.8, 22, 3)," +
                "(2024, '2', 8.1, 7.1, 22, 3)," +
                "(2024, '3', 8.6, 7.2, 22, 3)," +
                "(2024, '4', 8.3, 6.7, 22, 3);");
    }
}
