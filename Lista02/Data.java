package Lista02;

public class Data {
	int dia;
	int mes;
	int ano;
	
	
	//Retorna dia
	public int getDia() {
		return this.dia;
	}
	
	//Retorna mês
	public int getMes() {
		return this.mes;
	}
	
	//Retorna ano
	public int getAno() {
		return this.ano;
	}
	
	void inicializarData() {
		this.dia = getDia();
	    this.mes = getAno();
	    this.ano = getAno();
		
		
	}
	public void setData(int dia, int mes, int ano){
		if(verificaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.printf("Data inválida.");
            System.exit(-1);
        }
    }
	
	boolean verificaData(int dia, int mes, int ano) {
		 if((mes>=1)&&(mes<=12)){
		        if(mes==2){
		            if((dia>=1) && (dia<=29)){
		                return true;
		            }else if((dia>=1) && (dia<=28)){
		                return true;
		            }
		            return false;
		            }else if((dia>=1) && (dia<=30) && ((mes%2==0) && (mes!=8))){
		            return true;
		            }else if((dia>=1) && (dia<=31)){
		            return true;
		            }
		    }
		    return false;
		        }
	
	 public void imprimirData() {
		 System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
	 public void imprimeDataPorExtenso() {
		 String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	     System.out.printf("\n%d de %s de %d.\n", this.dia, m[getMes()-1], this.ano);
	 }
	
}
