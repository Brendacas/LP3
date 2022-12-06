package Lista2;

public class LampadaMain {
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		LampadaBool lampada1 = new LampadaBool();
		LampadaTresEstados lampada2 = new LampadaTresEstados();
		LampadaPorcentagem lampada3 = new LampadaPorcentagem();
		
		lampada.setCor("azul");
		lampada.setPotencia(2.0);
		lampada.setValor(3.0);
		lampada.setVoltagem(2.5);
		lampada.imprimeDados();
		
		lampada1.estaLigada();
		lampada1.setEstadoPorcentagem(50);
		
		lampada2.acesa();
		lampada2.apagada();
		lampada2.meiaLuz();
		lampada2.imprimeEstado();
		
		lampada3.setEstadoPorcentagem(50);
		lampada3.imprimePorcentagem();
		
		
		
	}

}
