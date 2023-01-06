import java.util.Scanner;

import EstruturaDeDados.List;

public class Cadastros <T extends Comparable<T>>{
    protected String nomeProfessor, nomeAluno;
    protected String senhaProfessor, senhaAluno;
    protected int cod, mat; //codigo e matricula
    protected Turma disciplina;
    private int opcao;
    List<Professor> p = new List<Professor>();
   

    Scanner cadastro = new Scanner(System.in);
   
    public void cadastroProfessor( String nomeProfessor, String senhaProfessor, int cod){
        
        System.out.println("Insira o nome de usuario: ");
        nomeProfessor = cadastro.nextLine();
        p.procuraNo(nomeProfessor);
        System.out.println("Insira o seu codigo: ");
        cod = cadastro.nextInt();
        p.procuraNo(nomeProfessor);
        System.out.println("Insira a sua senha: ");
        senhaProfessor = cadastro.nextLine();
        p.insereFront(nomeProfessor);

    }
    public void cadastroAluno(String nomeAluno, String senhaAluno, int mat){
        
        System.out.println("Insira o nome de usuario: ");
        nomeAluno = cadastro.nextLine();
        System.out.println("Insira a sua senha: ");
        senhaAluno = cadastro.nextLine();
        System.out.println("Insira a sua matricula: ");
        mat = cadastro.nextInt();
    }
    //Valida se tem o mesmo nome de usuario
    public void validaUsuario(Usuario usuario, Usuario nome){
        //irei usar a comparação com lista e arvore
        
    }
    //valida se é aluno ou professor
    public void verificaUsuario(){
        while(opcao != 3){
            System.out.println("[1] Novo professor");
            System.out.println("[2] Novo aluno");
        }
        switch(opcao){
            case 1:{
            cadastroProfessor(nomeProfessor, senhaProfessor, cod);
            }
            case 2:{
            cadastroAluno(nomeAluno, senhaAluno, mat);
            }
        }
    }
  
    //valida se tem turma repetida
    public Turma verificaTurma(){
        return disciplina;
    }
  
}
