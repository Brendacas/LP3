public class Time{
    private int hora;
    private int min;
    private int seg;

    public Time(){
        this(0);
    }

    public Time(int hora){
        this(hora, 0);
    }

    public Time(int hora, int minuto){
        this(hora, minuto, 0);
    }

    public Time(int hora, int minuto, int segundo){
        this.hora = hora;
        this.min = minuto;
        this.seg = segundo;
    }

    public Time(Time t){
        this.hora = t.getHora();
        this.min = t.getMinuto();
        this.seg = t.getSegundo();
    }

    public void addTime(int s){
        if(s < 0){
            System.out.printf("Invalid seconds!!\n");
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
            System.out.println("Error in addTime, invalide minute!!");
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
            System.out.println("Error in addTime, invalide minute!!");
            System.exit(-1);
        }
        this.addTime(m, s);
        this.hora = this.hora + h;
        if(this.hora >= 24){
            this.hora = this.hora % 24;
        }
    }

    public void addTime(Time obj){
        this.addTime(obj.getHora(), obj.getMinuto(), obj.getSegundo());
    }

    public boolean isAm(){
        if((this.hora < 12) && (this.hora > 0)){
            return true;
        }
        return false;
    }

    public int cron(Time outraHora){
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

    public void addSeconds(int secs){
        if(secs < 0){
            System.out.printf("Invalid seconds!!\n");
            System.exit(-1);
        }
        this.seg = this.seg + secs;
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

    private boolean validaTime(int hora, int min, int seg){
        return validaHora(hora) && validaMinSeg(min) && validaMinSeg(seg);
    }

    private boolean validaHora(int hora){
        if((hora>0) && (hora<25))
            return true;
        else
            return false;
    }

    private boolean validaMinSeg(int param){
        if((param>0) && (param<61))
            return true;
        else
            return false;
    }

    public void setTime(int hora, int min, int seg){
        if (validaTime(hora, min, seg)) {
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
        String res = this.hora + ":" + this.min + ":" + this.seg;
        return res;
    }

    public void prnTime(){
        System.out.println(getTime());
    }
}