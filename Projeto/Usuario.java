

//usuario abstrato
public abstract class Usuario{
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

}
    





