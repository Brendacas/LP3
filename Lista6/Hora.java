package Lista6;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora(){
        this(0);
    }

    public Hora(int hora){
        this(hora, 0);
    }

    public Hora(int hora, int minuto){
        this(hora, minuto, 0);
    }

    public Hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.min = minuto;
        this.seg = segundo;
    }

    public Hora(Hora t){
        this.hora = t.getHora();
        this.min = t.getMinuto();
        this.seg = t.getSegundo();
    }

    public void addTime(int s){
        if(s < 0){
            System.out.printf("Segundos invalidos!!\n");
            System.exit(-1);
        }
        this.seg = this.seg + s;
        if(this.seg >= 60){
            this.min = this.min + this.seg / 60;
            this.seg = this.seg % 60;
            if(this.min >= 60){
                this.hora = this.hora + this.min / 60;
                this.min = this.min % 60;
                if(this.hora >= 24){
                    this.hora = this.hora % 24;
                }
            }
        }
    }

    public void addTime(int m, int s){
        if((m < 0) || (s < 0)){
            System.out.println("Erro em addTime, minuto invalido!!");
            System.exit(-1);
        }
        this.addTime(s);
        this.min = this.min + m;
        if(this.min >= 60){
            this.hora = this.hora + this.min / 60;
            this.min = this.min % 60;
            if(this.hora >= 24){
                this.hora = this.hora % 24;
            }
        }
    }

    public void addTime(int h, int m, int s){
        if((h < 0) || (m < 0) || (s < 0)){
            System.out.println("Erro em addTime, minuto invalido!!");
            System.exit(-1);
        }
        this.addTime(m, s);
        this.hora = this.hora + h;
        if(this.hora >= 24){
            this.hora = this.hora % 24;
        }
    }

    public void addTime(Hora objeto){
        this.addTime(objeto.getHora(), objeto.getMinuto(), objeto.getSegundo());
    }

    public boolean isAm(){
        if((this.hora < 12) && (this.hora > 0)){
            return true;
        }
        return false;
    }

    public int cron(Hora outraHora){
        int hora = mode(outraHora.getHora() - this.hora);
        int minuto = mode(outraHora.getMinuto() - this.min);
        int segundo = mode(outraHora.getSegundo() - this.seg);

        return (hora * 3600) + (minuto * 60) + (segundo);
    }

    private int mode(int n){
        if(n < 0){
            return ((-1) * n);
        }
        return n;
    }

    public void addSeconds(int seg){
        if(seg < 0){
            System.out.printf("Segundos invalidos!!\n");
            System.exit(-1);
        }
        this.seg = this.seg + seg;
        if(this.seg >= 60){
            this.min = this.min + this.seg / 60;
            this.seg = this.seg % 60;
            if(this.min >= 60){
                this.hora = this.hora + this.min / 60;
                this.min = this.min % 60;
                if(this.hora >= 24){
                    this.hora = this.hora % 24;
                }
            }
        }
    }

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.min;
    }

    public int getSegundo(){
        return this.seg;
    }

    private boolean validarTime(int hora, int min, int seg){
        return validarHora(hora) && validarMinOuSeg(min) && validarMinOuSeg(seg);
    }

    private boolean validarHora(int hora){
        if((hora>0) && (hora<25))
            return true;
        else
            return false;
    }

    private boolean validarMinOuSeg(int param){
        if((param>0) && (param<61))
            return true;
        else
            return false;
    }

    public void setTime(int hora, int min, int seg){
        if (validarTime(hora, min, seg)) {
            this.hora = hora;
            this.min = min;
            this.seg = seg;
        }
        else{
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public String getTime(){
        String resultado = this.hora + ":" + this.min + ":" + this.seg;
        return resultado;
    }

    public void prnTime(){
        System.out.println(getTime());
    }

    public String toString(){
        return hora + ":" + min + ":" + seg;
    }
}
    
