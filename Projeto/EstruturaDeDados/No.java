

public class No <T>{
    public T aluno; //Objeto generico que o nó armazena
    public No<T> prox; //Nó para o proximo objeto
    public No<T> ant; //Nó para o ojeto anterior

    //Construtor que recebe um dado generico
    No(T aluno){
        this.aluno = aluno;
        this.prox = null;
        this.ant = null;
    }
}
