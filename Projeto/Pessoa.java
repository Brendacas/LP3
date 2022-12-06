public class Pessoa{
    private String nome;
    private int CPF;
    private Data nascimento;
    private String email;

    Pessoa(String n, int cpf, Data d, String Email){
        nome = n;
        CPF = cpf;
        nascimento = d;
        email = Email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        String resultado;
        resultado = "Nome: "+nome+"\nEmail: "+email+"\nCPF: "+CPF+"\n";
        if (this.nascimento != null)
           resultado += "Data de Nascimento: "+nascimento.toStringLong();
        
        //resultado = super.toString() + "\n" + resultado;
                
        return resultado;
   }

}
    





