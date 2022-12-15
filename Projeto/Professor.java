public class Professor extends Usuario{
    protected String disciplina;
    protected long codigo;
    //Construtor
    public Professor(String name, int id, long codigo, String disciplina){
        super(name, id);
        if(validarInfo2(codigo, disciplina)){
            this.codigo = codigo;
            this.disciplina = disciplina;
        }else{
            System.out.println("Error detting information!!");
            System.exit(-1);
        }
    }
    //Construtor sem parametro
    public Professor(){
        this("nome", 457, 1015l, "LP3");
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    public long getCodigo(){
        return this.codigo;
    }
    //Define as informações do professor
    public void setInfo(long codigo, String disciplina){
        if(validarInfo2(codigo, disciplina)){
            this.codigo = codigo;
            this.disciplina = disciplina;
           
        }else{
            System.out.println("Erro em definir as informacoes");
            System.exit(-1);
        }
    }
    public boolean validarInfo2(long codigo, String disciplina){
        if(codigo < 999){
            return false;
        }else if(disciplina == null){
            return false;
        }else{
            return true;
        }
    }
    @Override
    public int compareTo(Professor p){
        if((super.compare(p) == 0) && (p.getDisciplina().equals(disciplina) && p.getCodigo().equals(codigo))){
            return 0;
        }else{
            return 1;
        }
    }
    @Override
    public String toString(){
        return "Dados do(a) professor(a)\n" + super.toString() + "Codigo: " + codigo + "\nMateria que o(a) professor(a) leciona: " + disciplina + "\n";
    }

}
