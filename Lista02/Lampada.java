package Lista2;

public class Lampada {
	private String cor = new String();
	private double potencia;
	private double voltagem;
	private double valor;
	
	//retorna a cor
	public String getCor() {
		return this.cor;
	}
	//retorna a potencia
	public double getPotencia() {
		return this.potencia;
	}
	//retorna voltagem 
	public double getVoltagem() {
		return this.voltagem;
	}
	//retorna o valor
	public double getValor() {
		return this.valor;
	}
	//Define a cor
	public void setCor(String cor) {
		this.cor = cor;
	}
	//Define a potencia
	public void setPotencia(double potencia) {
		if (potencia<0) {
			System.out.println("Potencia Invalida!! \n");
			System.exit(-1);
		}
		this.potencia = potencia;
	}
	//Define a Voltagem 
	public void setVoltagem(double voltagem) {
		if (voltagem<0) {
			System.out.println("Voltagem Invalida!! \n");
			System.exit(-1);
		}
		this.voltagem = voltagem;
	}
	//Define o Valor
	public void setValor(double valor) {
		if (valor<0) {
			System.out.println("Valor Invalido!! \n");
			System.exit(-1);
		}
		this.valor = valor;
	}
	public void imprimeDados() {
		System.out.println("Cor: "+ getCor());
		System.out.println("Voltagem: "+ getVoltagem());
		System.out.println("Valor: "+ getValor());
		System.out.println("Potencia: "+ getPotencia());
			
		}
	}


