import Estruturas.*;

public class Turma {
    private static final int vagas = 30; //Número de vagas
    private Aluno[] alunos = new Aluno[vagas]; //Vetor para os estudantes da classe
    private Queue<Aluno> queue = new Queue<Aluno>(); //Fila para os alunos
    private String nomeTurma; //Nome da turma

    //Construtor recebe o nome da turma
    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma;
    }
    //imprime os alunos da turma
    public void imprimeAlunos(){
        System.out.printf("\n\nAlunos matriculados em %s\n\n", this.nomeTurma.toUpperCase());

        for(int i = 0; i < vagas; i++){
            System.out.println(alunos[i]);
        }
    }
}
   