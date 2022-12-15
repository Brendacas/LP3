package Estruturas;

public class No <T>{
    public T dadosT; //Objeto generico que o nó armazena
    public No<T> prox; //Nó para o proximo objeto
    public No<T> ant; //Nó para o ojeto anterior

    //Construtor que recebe um dado generico
    No(T dados){
        this.dadosT = dados;
        this.prox = null;
        this.ant = null;
    }
}