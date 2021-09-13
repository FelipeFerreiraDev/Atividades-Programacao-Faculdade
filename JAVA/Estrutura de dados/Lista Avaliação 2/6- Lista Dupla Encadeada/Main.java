class Main {
  public static void main(String[] args) {

    Lista listaAlunos = new Lista();
    Lista listaCursos = new Lista();

      Aluno a1 = new Aluno("Andrew Garfield", 181818, 9.8, "Ciencia");
      Aluno a2 = new Aluno("Tom Holland", 20020, 8.5, "Historia");
      Aluno a3 = new Aluno("Renato Cariani", 59919, 2.5, "Ed Fisica");

      Curso c1 = new Curso("Ciencias");
      Curso c2 = new Curso("Historia");
      Curso c3 = new Curso("Ed Fisica");

      listaAlunos.insereFim(new No(a1));
      listaAlunos.insereFim(new No(a2));
      listaAlunos.insereFim(new No(a3));
      listaCursos.insereFim(new No(c1));
      listaCursos.insereFim(new No(c2));
      listaCursos.insereFim(new No(c3));

      listaAlunos.imprimeLista();
      listaCursos.imprimeLista();

      Lista listaHibrida = new Lista();
      listaHibrida.insereFim(new No(a1));
      listaHibrida.insereFim(new No(a2));
      listaHibrida.insereFim(new No(a3));
      listaHibrida.insereFim(new No(c1));
      listaHibrida.insereFim(new No(c2));
      listaHibrida.insereFim(new No(c3));

      System.out.print("\n\n\n");
      listaHibrida.imprimeLista();
  }
}