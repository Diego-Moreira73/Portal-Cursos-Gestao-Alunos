package PortalCursos;

import java.util.ArrayList;

public class Cursos implements Relatorio{

    private String nomeCurso;
    private ArrayList<Alunos> alunos = new ArrayList<>();

    public Cursos(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public void adicionarAluno(Alunos aluno) {
        alunos.add(aluno);
    }

    @Override
    public void imprimirRelatorio() {
        System.out.println("Curso: " + this.nomeCurso);
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno matriculado nesta turma ainda.");
        } else {
            for(Alunos alunos : alunos) {
                System.out.println("Nome: " + alunos.getNome() + " | Matrícula: " + alunos.getMatricula());
            }
        }
    }
}
