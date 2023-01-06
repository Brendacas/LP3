import java.util.*;
  public class ProjetoMain {
  
      public static void main (String[] args){
  
          Scanner scan = new Scanner(System.in);
          Cadastros cadastro = new Cadastros();
          int op = 0;
  
          do{
              System.out.println("##ESCOLHA UMA OPÇÃO##\n");
              System.out.println("1 - Cadastrar Aluno");
              System.out.println("2 - Cadastrar Professor");
              System.out.println("3 - Login\n");
              System.out.println("4 - Sair\n");
              System.out.println("Digite uma opção: ");
              op = scan.nextInt();
              switch(op){
                case 1:
                cadastroAluno();
              }
          }
      }
    }