import java.lang.String;
import java.util.Scanner;
//Class Aluno herda da class Usuario
public class Aluno extends Usuario{
   protected int matricula;

   Scanner scan = new Aluno();

    //Construtor
    public Aluno(String nome, String usuario, int id, String senha, String Turma, int cd, int mat) {
        super(nome, usuario,id, senha);
        if(validaInfo(mat)){
            this.matricula = mat;
        }
        else{
            System.err.println("Erro nas informacoes");
        }
    }

    //Construtor sem parametro
    public Aluno(){
        this("Brenda","brendac",1024568745,"teste123","A",123,102541205);
    }

    //retorna turma
    private String getTurma(){
        return this.turma;
    }

    public boolean validaInfo(int matricula){
        if((matricula > 01) && (matricula < 999999999)){
            return true;
        }else {
            return false;
        }
    }
    public void matricularTurma(int codigo, Turma disciplina, Turma turma, Professor professor){
      
    }
    public void verTarefas(Turma disciplina, Turma avaliacoes){


    }
    public void verNotas(Turma disciplina, Professor notas){

    }
    public int getMatricula(int matricula){
        return this.matricula;
    }

    @Override
    public int compareTo(Aluno a){
      if((super.compare(a)==0) && ((a.getMatricula() == this.matricula) && (a.getNome().equals(this.nome)))){
        return 1;
      }else{
        return 0;
      }
    }

    @Override
    public String toString(){
        return "Dados do aluno\n\n" + super.toString() + "Numero de matricula: " + this.matricula + "\nTurma do aluno: " + this.turma + "\n";
    }
}

