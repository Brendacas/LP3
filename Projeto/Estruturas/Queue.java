package Estruturas;
//Classe Queue genérica que herda list generica
public class Queue<Professor extends Comparable<Professor>> extends List<Professor>{
    //Construtor
    public Queue(Professor dados){
        setRear(dados);
    }

    //Construtor sem parametro
    public Queue(){
        setFront(null);
    }

    //Metodo enqueue que coloca um objeto no final da fila
    public void enqueue(Professor dados){
        setRear(dados);
    }

    //Metodo dequeue que remove um objeto do começo da fila
    public Professor dequeue(){
        if(getTam() == 0){
            System.out.println("Erro!\n\n");
            System.exit(-1);
        }

        return removeFront();
    }
}

