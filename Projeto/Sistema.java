import java.util.*;
public class Sistema {
    private static final int vagas=30; //vagas aluno
    private static final int quantVagasP = 50; // vagas prof
    private Professor[] professor = new Professor[quantVagasP];

    //Variaveis contadoras para a quantidade de alunos da turma
    private static int cont1 = 0;
    private static int cont2 = 0;
    private static int cont3 = 0;
    private static int cont4 = 0;
    private static int cont5 = 0;
    private static int cont6 = 0;
    private static int contA = 0;
    private static int contP = 0;


    //Fila para os professores
    private Queue<Professor> queueProfessor = new Queue<Professor>();

    //Objetos para as turmas
    private Turma calculo = new Turma("Calculo");
    private Turma lp3 = new Turma("Linguagem de Programacao III");
    private Turma eD = new Turma("EStrutura de Dados");
    private Turma aa = new Turma("Algebra Abstrata");
    private Turma economia= new Turma("Fundamentos de economia");
    private Turma ld2 = new Turma("Logica Digital II");

    public void setAluno(Aluno al, int i){
        if(i > vagas){
            System.out.printf("Total de vagas na turma preenchida\n\n");
            return;
        }
    }
    //Metodo mara o menú
    public int menu() throws Exception{
        //Imprime na tela as opções
        System.out.printf("\n\nIniciando o sistema!!\n\n");
        System.out.printf("[1] Cadastrar Aluno\n");
        System.out.printf("[2] Cadastrar Professor\n");
        System.out.printf("[3] Login\n");
        System.out.printf("[4] Sair\n");
        System.out.println("-------------------------------------");
        System.out.printf("DIGITE SUA OPÇÃO: ");

        Scanner entrada = new Scanner(System.in);
        int op = entrada.nextInt();

        //Switch para escolher o qual opção será executada
        switch(op){
            case 1:
               CadastraProfessor();
                return 1;
            case 2:
                CadastraAluno();
                return 1;
            case 3:
                int login = 0;
                Scanner in = new Scanner(System.in);
                System.out.println ("Usuário: ");
                String nome = in.nextLine();
                System.out.println ("Senha: ");
                String senha = in.nextLine();
            case 4:
               System.out.println("Encerrando o Sistema....");
               System.exit(-1);
            
           
            default:
                System.out.printf("Erro, entrada invalida!!\n\n");
                return 1;
        }
    }

    //Cadastra um estudante
    public void CadastraAluno(){
        Scanner a = new Scanner(System.in);

        System.out.printf("\n\nCADASTRO DO ALUNO\n\n");

        //Pega as informações
        System.out.printf("Digite o nome do(a) aluno(a): ");
        String nome = a.nextLine();
        System.out.printf("Digite o CPF do() aluno(a): ");
        String id = a.nextLine();
        System.out.printf("Digite o número de matricula do(a) aluno(a): ");
        int matricula = a.nextInt();
        

        Aluno al = new Aluno(nome, id, matricula);
        String[] turma = {"Calculo", "Linguagem de Programacao III", "Estrutura de Dados","Algebra Abstrata", "Fundamentos de Economia", "Logica Digital II"};

        if(turma[0].equals(turma)){
            calculo.setAluno(al, cont1);
            ++cont1;
        }else if(turma[1].equals(turma)){
            lp3.setAluno(al, cont2);
            ++cont2;
        }else if(turma[2].equals(turma)){
            eD.setAluno(al, cont3);
            ++cont3;
        }else if(turma[3].equals(turma)){
            aa.setAluno(al, cont4);
            ++cont4;
        }else if(turma[4].equals(turma)){
            economia.setAluno(al, cont5);
            ++cont5;
        }else if(turma[5].equals(turma)){
           ld2.setAluno(al, ld2);
            ++cont6;
        }else{
            System.out.printf("Não encontramos a turma!!\n\n");
        }
        setAluno(al);
    }

    //Cadastra um professor na universidade
    public void CadastraProfessor(){
        Scanner prof = new Scanner(System.in);

        System.out.printf("\n\nCADASTRO DO PROFESSOR\n\n");

        //Pega as informações
        System.out.printf("Digite o nome do(a) professor(a): ");
        String name = prof.nextLine();
        System.out.printf("Digite o CPF do(a) professor(a): ");
        String id = prof.nextLine();
        System.out.printf("Digite o codigo do(a) professor(a): ");
        long codigo = prof.nextLong();
        System.out.printf("Digite a disciplina que o(a) professor(a) leciona: ");
        prof.nextLine();
        String disciplina = prof.nextLine();

        Professor p = new Professor(name, id, codigo, disciplina);

        setProfessor(p);
    }//Fim enrollProfessor

    //Coloca um professor no vetor
    public void setProfessor(Professor p){
        if(contP > quantVagasP){
            System.out.printf("Nao tem mais vaga!!\n\n");
            return;
        }
        professor[contP] = p;
        ++contP;
    }
  

}

