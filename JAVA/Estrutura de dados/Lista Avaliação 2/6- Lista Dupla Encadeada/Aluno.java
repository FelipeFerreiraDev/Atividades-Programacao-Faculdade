public class Aluno {
    String nomeAluno;
    int matriculaAluno;
    double notaAluno;
    String cursoAluno;

    public Aluno(String nome, int matricula, double nota, String curso){
        nomeAluno = nome;
        matriculaAluno = matricula;
        notaAluno = nota;
        cursoAluno = curso;
    }

    public String toString(){
        return "Nome: "+nomeAluno+" Matricula: "+matriculaAluno+" Notas: "+notaAluno+ " Curso: "+cursoAluno;
    }
}