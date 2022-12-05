public class Time{
    int hora;
    int min;
    int segundos;

    public Time(int hora, int min, int segundos){
        this.hora = hora;
        this.min = min;
        this.segundos = segundos;
    }
    public Time(){
        this.hora = 0;
        this.min = 0;
        this.segundos = 0;
    }

    public int getHora(){
        return this.hora;
    }
    public int getMin(){
        return this.min;
    }
    public int getSegundos(){
        return this.segundos;
    }

    public boolean isAm(){
        if(hora<12 && hora>0){
            return true;
        }else{
            return false;
        }
    }

    private boolean validaTime(int hora, int min, int segundos){
        if((hora>0 && hora<25) && (min>=0 && min<61) && (segundos>=0 && segundos<61)){
            return true;
        }else{
            return false;
        }
    }

    public void setTime(int hora, int min, int segundos){
        if(validaTime(hora, min, segundos)){
            this.hora = hora;
            this.min = min;
            this.segundos = segundos;
        }else{
            this.hora = 0;
            this.min = 0;
            this.segundos = 0;
        }
    }

    public int cron(Time outraHora){
        int horas = mode(outraHora.getHora() - this.hora);
        int minuto = mode(outraHora.getMin() - this.min);
        int segundos = mode(outraHora.getSegundos() - this.segundos);

        return (horas * 3600) + (minuto * 60) + (segundos);
    }
    private int mode(int n){
        if(n < 0){
            return (-1) * n;
        }
        return n;
    }

    public void addSegundos(int secs){
        if(secs < 0){
            System.out.printf("Erro\n");
            System.exit(-1);
        }
        this.segundos = this.segundos + secs;
        if(this.segundos >= 60){
            this.min = this.min + this.segundos / 60;
            this.segundos = this.segundos % 60;
            if(this.min >= 60){
                this.hora = this.hora + this.min / 60;
                this.min = this.min % 60;
                if(this.hora >= 24){
                    this.hora = this.hora % 24;
                }
            }
        }
    }

    public void imprimeTime(){
        String imprime = this.hora + ":" + this.min + ":" + this.segundos;
        System.out.printf(""+ imprime + "\n");
    }


}