
//Class Aluno herda da class Pessoa
public class Aluno extends Pessoa{
    private int matricula;
    private String turma;
    private int codigo;

    //Construtor
    Aluno(String nome, String Turma, int cd, Data nascm, int mat) {
        //super(nome, id, nascm);
        super(nome, CPF, nascm,email);
        codigo = cd;
        matricula= mat;
        turma = Turma;
    }
    
   
}
