package Lista2;

public class LampadaTresEstados {
	private int estado;
	
	public void apagada() {
		this.estado=0;
	}
	public void acesa() {
		this.estado=1;
	}
	public void meiaLuz() {
		this.estado=2;
	}
	
	public void imprimeEstado() {
		if(this.estado == 0) {
			System.out.println("Lampada Apagada!!");
		}
		else if(this.estado == 1) {
			System.out.println("Lampada Acesa");
		}else
			System.out.println("Meia Luz");
	}

}
