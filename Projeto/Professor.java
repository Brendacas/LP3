
public class Professor extends Pessoa{
    private int idProfessor;
    private String disciplina;

    Professor(String nome, String disc, int idProf, Data nascm) {
        super(nome, email, CPF, nascm);

        disciplina = disc;
        idProfessor = idProf;
    }

}
