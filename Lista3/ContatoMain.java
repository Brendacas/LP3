public class ContatoMain{
    public static void main(String[]args){
        Contato contato = new Contato("Brenda", "bcsilva.cic@uesc.br", "7317321", 28, 11, 2002);

        /*contato.setData(28, 11, 2002);
        contato.setEmail("bcsilva.cic@uesc.br");
        contato.setTelefone("08080000");
        contato.setNome("Brenda");*/
        contato.imprimeContato();
        System.out.println("Idade = " + contato.calculaIdade());
    }
}