package Estruturas;
//Classe Queue genérica que herda list generica
public class Queue<T extends Comparable<T>> extends List<T>{
    //Construtor
    public Queue(T dados){
        setRear(dados);
    }

    //Construtor sem parametro
    public Queue(){
        setFront(null);
    }

    //Metodo enqueue que coloca um objeto no final da fila
    public void enqueue(T dados){
        setRear(dados);
    }

    //Metodo dequeue que remove um objeto do começo da fila
    public T dequeue(){
        if(getTam() == 0){
            System.out.println("Erro!\n\n");
            System.exit(-1);
        }

        return removeFront();
    }
}

