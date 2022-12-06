package Lista2;

public class ContatoMain {
	public static void main(String[] args) {
		Contato contato = new Contato();
		
		    contato.setData(28, 11, 2002);
	        contato.setEmail("bcsilva.cic@uesc.br");
	        contato.setTelefone("08080000");
	        contato.setNome("Brenda");
	        contato.imprimeContato();
	        System.out.println("Idade = " + contato.calculaIdade());
	    }
		
		
	}

