package Lista2;

public class LampadaBool {
	private int estadoPorcentagem;
	
	public int getEstadoPorcentagem(){
		return this.estadoPorcentagem;
	}
	public void setEstadoPorcentagem(int estadoPorcentagem) {
		if (estadoPorcentagem >= 0 || estadoPorcentagem <= 100) {
			this.estadoPorcentagem = estadoPorcentagem;
		}else {
			System.out.println("erro!!");
			System.exit(-1);
		}
	}
	public boolean estaLigada() {
		if(getEstadoPorcentagem()>0 && getEstadoPorcentagem()<=100) {
			return true;
		}else {
			return false;
		}
	}
}


