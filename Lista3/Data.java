public class Data {
       private int dia;
       private int mes;
       private int ano;
        
    public Data(int dia, int mes, int ano){
        setData(dia, mes, ano);
    }
    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }
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
        public boolean isPrevious(Data outraData){
                        if(this.ano>outraData.getAno()){
                            return true;
                        }else if(this.ano<outraData.getAno()){
                            return false;
                        }else{
                            if(this.mes>outraData.getMes()){
                                return true;
                            }else if(this.mes<outraData.getMes()){
                                return false;
                            }
                        }
                            if(this.dia>outraData.getDia()){
                                return true;
                            }
                            return false;
                        }
                        
                    
        public int howManyDays(Data outraData){
                        if(isPrevious(outraData)){
                            float diferencaAno = (float)mode(outraData.getAno() - this.ano) - 1;
                            float diferencaMes1 = 12.0f - outraData.getMes();
                            float diferencaMes2 = this.mes - 1.0f + 1;
                            float dias = (diferencaAno * 365.25f) + ((diferencaMes1 + diferencaMes2) * 365.25f / 12);
                            return (int)(-dias);
                        }else{
                            float diferencaAno = (float)mode(outraData.getAno() - this.ano) - 1;
                            float diferencaMes1 = 12.0f - this.mes;
                            float diferencaMes2 = outraData.getMes() - 1.0f + 1;
                            float dias = (diferencaAno * 365.25f) + ((diferencaMes1 + diferencaMes2) * 365.25f / 12);
                            return (int)dias;
                        }
                    }
        private int mode(int n){
                        if(n < 0){
                            return (-1 * n);
                        }
                        return n;
                    }
                
        public String dayOfWeek(Data date){
                        int d = date.getDia();
                        int m = date.getMes();
                        int a = date.getAno();
                        int k = 0;
                        String[] diasSemana = {"Sabado", "Domingo","Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};
                
                        if(m == 1){
                            k = d + 2 * 13 + (3 * (13 + 1) / 5) + (a - 1) + ((a - 1) / 4) - ((a - 1) / 100) + ((a - 1) / 400) + 2;
                        }else if(m == 2){
                            k = d + 2 * 14 + (3 * (14 + 1) / 5) + (a - 1) + ((a - 1) / 4) - ((a - 1) / 100) + ((a - 1) / 400) + 2;
                        }else{
                            k = d + 2 * m + (3 * (m + 1) / 5) + a + (a / 4) - (a / 100) + (a / 400) + 2;
                        }
                
                        return diasSemana[k % 7];
                    }
        public void imprimirData() {
             System.out.printf("%d/%d/%d", dia, mes, ano);
        }
        
         public void imprimeDataPorExtenso() {
             String m[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
             System.out.printf("\n%d de %s de %d.\n", this.dia, m[getMes()-1], this.ano);
         }
        
     }
