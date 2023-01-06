public class Data {
    private int dia;
    private int mes;
    private int ano;
    final static String[] m = {"Janeiro", "Fevereiro", "Março", "Abril",
                                "Maio", "Junho", "Julho", "Agosto",
                                "Setembro", "Outubro", "Novembro", "Dezembro"};

    //Construtores
    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }

    public Data(int dia, int mes, int ano){
        if (verificaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    //Metodo para verificar a data
    private boolean verificaData(int dia, int mes, int ano){
        if (dia < 1 || dia > 31){
            return false;
        }else if (mes < 1 || mes > 12){
            return false;
        }else if (ano<1900)
            return false;
        return true;
    }
    //Metodo para imprimir a data no formato 01/01/2000
    public void toStringShort() {
        System.out.printf("%d/%d/%d", dia, mes, ano);
   }
   
    public void toStringLong() {
       
        System.out.printf("\n%d de %s de %d.\n", this.dia, m[mes-1], this.ano);
    }

}
