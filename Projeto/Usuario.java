//class abstrata
public abstract class Usuario implements Comparable<Usuario>{
    protected String nome;
    private String usuario;
    private String senha;
    private int id;
    
    public Usuario(String nome, String usuario, int id, String senha) {
        this.nome = nome;
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        }
    protected String getUsuario() {
        return this.usuario;
    } 
    protected String getSenha () {
        return this.senha;
    }
    protected String getNome () {
        return this.nome;
    }      
    protected int getId(){
        return this.id;
    }
    public void setInfo(String nome, String usuario, String senha, int id){
        if(validateInfo(nome, usuario,id)){
            this.nome = nome;
            this.usuario = usuario;
            this.id=id;
        }else{
            System.out.println("Erro ao atualizar as informacoes!");
            System.exit(-1);
        }
    }
    //validar informações
    public boolean validateInfo(String nome, String usuario, int id){
        if(nome == null){
            return false;
        }else if(usuario == null){
            return false;
        }else if(id == 0){
            return false;
        }else{
            return true;
        }
    }
    public int compare(Usuario u){
        if((u.getId() == this.id) && u.getUsuario().equals(this.usuario)){
            return 1;
        }else {
			return 0;
	    }
    }
    @Override
    public String toString(){
        return "\nName: " + nome + "\nId: " + id + "\nUsuario: " + this.usuario.toString();
    }//Fim compareTo
}
