package Projeto;

public class Cadastros {
    private String usuario;
    private int senha;
    private static final String PASSWORD_REGEX =
            "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
 


    public String getUsuario(String usuario){
        return usuario;
    }
    public int getSenha(int senha){
        return senha;
    }
    
    public boolean validaSenha(int senha, static PASSOWORD_REGEX){
        if(PASSWORD_REGEX){
            return 1;
        }
    }

    

}
