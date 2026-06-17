package PortalCursos;

public class Main {

    public static void main(String[] args) {

        Alunos a1 = new Alunos("Diego", "2309401");
        Alunos a2 = new Alunos("Ian", "2309402");
        Alunos a3 = new Alunos("Lucas", "2309403");

        Cursos c1 = new Cursos("Java Avançado");

        c1.adicionarAluno(a1);
        c1.adicionarAluno(a2);
        c1.adicionarAluno(a3);

        imprimirRelatorio(c1);
    }

    public static void imprimirRelatorio(Relatorio curso) {
        curso.imprimirRelatorio();
    }
}
