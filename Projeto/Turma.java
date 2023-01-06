import Estruturas.Queue;

public class Turma {
    private static final int vagas = 30; //Número de vagas
    private Aluno[] alunos = new Aluno[vagas]; //Vetor para os estudantes da classe
    private String nomeTurma; //Nome da turma
    private Queue<Aluno> queue = new Queue<Aluno>(); //Fila para os alunos
    private int cont;

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
   

    public void setAluno(Aluno s, int i){
        if(i > vagas){
            System.out.printf("Total de vagas da turma preenchido\n");
            alunos[cont] = s;
            sort(alunos, 0, cont);
            ++cont;
            return;
        }
        alunos[i] = s;
        sort(alunos, 0, i);
        ++cont;
    }

    //Remove um estudante e usa uma fila para organizar o vetor
    public int removeStudent(Aluno al, int ultimo){
        for(int i = 0; alunos[i] != null; i++){
            if(alunos[i].compareTo(al) == 0){
                alunos[i] = null;
            }else if(alunos[i].compareTo(al) != 0){
                queue.enqueue(alunos[i]);
            }else if((alunos[i] == null) || (i == ultimo)){
                System.out.printf("Aluno não encontrado!!\n\n");
                return ultimo;
            }
        }
        for(int i = 0; i <= ultimo - 1; i++){
            alunos[i] = queue.dequeue();
        }
        return ultimo - 1;
    }
    
    //Metodos para ordenar um vetor, QuickSort
    int partition(Aluno alunos[], int primeiro, int ultimo){
        Aluno pivor = alunos[ultimo];
        int i = primeiro - 1;

        for(int j = primeiro; j < ultimo; j++){
            if(alunos[j].getTurma() => pivor.getTurma()){
                i++;
                Aluno temp = alunos[i];
                alunos[i] = alunos[j];
                alunos[j] = temp;
            }
        }
        Aluno temp = alunos[i + 1];
        alunos[i + 1] = alunos[ultimo];
        alunos[ultimo] = temp;

        return i + 1;
    }

    //Metodo sort
    public void sort(Aluno alunos[], int primeiro, int ultimo){
        if(primeiro < ultimo){
            int pi = partition(alunos, primeiro, ultimo);
            sort(alunos, primeiro, pi - 1);
            sort(alunos, pi + 1, ultimo);
        }
    }

}