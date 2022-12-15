
import java.util.Random;
public class Craps {
	public static void main(String[] args) {
		Random rand = new Random();
		int dado1 = rand.nextInt(6)+1;
		int dado2 = rand.nextInt(6)+1;
		int ponto= dado1+dado2;
		
		System.out.println("dado1= " +dado1);
		System.out.println("dado2= " +dado2);
		System.out.println("A soma dos pontos foi= "+ponto);
		
		//Se a soma for 7 ou 11 no primeiro lançamento o jogador vence.
		if(ponto==7||ponto==11) {
			System.out.println("Voce venceu!!!");
		}
		//Se a soma for 2, 3 ou 12 no primeiro lançamento (chamado Craps), o jogador perde (i.e. a “banca”vence).
		if(ponto==2||ponto==3||ponto==12) {
			System.out.println("Voce perdeu!!!, banca venceu!!");
		}
		//Se a soma for 4, 5, 6, 8, 9 ou 10 no primeiro lançamento esta soma se torna o “ponto” do jogador,
		//e o jogo entra no segundo estágio.
		if(ponto==4||ponto==5||ponto==6||ponto==8||ponto==9||ponto==10) {
			System.out.println("Ponto!! ");
		
		System.out.println("Estagio 2!!");
		int soma=0, jogadas=1;
		while(soma!=7||soma==ponto) {
			 dado1 = rand.nextInt(6)+1;
		     dado2 = rand.nextInt(6)+1;
			soma= dado1+dado2;
			
			System.out.println("dado1= " +dado1);
			System.out.println("dado2= " +dado2);
			System.out.println("Jogada" +jogadas +"=" +soma);
			jogadas++;
			
			if(soma==7) {
				System.out.println("Voce perdeu!!");
			}
		    if(soma==ponto) {
				System.out.println("Voce ganhou!!");
				break;
			}
		}
			
		}
		

}
}
