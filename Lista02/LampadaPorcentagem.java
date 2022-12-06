package Lista2;

public class LampadaPorcentagem {
    private int estadoPorcentagem;

    public int getEstadoPorcentagem(){
        return this.estadoPorcentagem;
    }

    public void setEstadoPorcentagem(int estadoPorcentagem){
        if(estadoPorcentagem>=0 || estadoPorcentagem<=100){
            this.estadoPorcentagem = estadoPorcentagem;
        }else{
            System.out.printf("erro\n");
            System.exit(-1);
        }
    }

    public void imprimePorcentagem(){
        System.out.printf("Luz em " + getEstadoPorcentagem());
    }
}