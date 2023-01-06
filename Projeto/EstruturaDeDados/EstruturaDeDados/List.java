package EstruturaDeDados;

import Estruturas.ListInterface;
import Estruturas.No;

public class List<T extends Comparable<T>> implements ListInterface<T>{
    private int tam = 0; //Guarda o tamanho da lista
    private No<T> head; //primeiro item 
    private No<T> tail; //ultimo item

    //construtor
    public List(){
        this.head = null;;
        this.tail = null;;
    }
    public int getTam(){
        return this.tam;
    }
    //Metodo que seta no inicio
    public void setFront(T aluno){
        T a = aluno;
        insereFront((String) a);
    }
    //Metodo que seta no final
    public void setRear(T aluno){
        T a = aluno;
        insereRear(a);
    }
    //Metodo que seta em qualquer posicao
    public void setPosicao(T aluno, int posicao){
        T a =aluno;
        inserePosicao(a,posicao);
    }
    //Insere no inicio
    public void insereFront(String nomeProfessor){
        No<T> newNo = new No<T>(nomeProfessor); // cria um novo no
        if(this.head == null){//se a lista estiver vazia
            head = newNo;;
            tail = newNo;
            ++tam;
        }else{ //caso tenha algum item
            newNo.prox= head;
            newNo.ant = tail;
            head.ant = newNo;
            tail.prox = newNo;
            head= newNo;
            ++tam;
        }
    }
    //Insere no final
    private void insereRear(T aluno){
        No<T> newNo = new No<T>(aluno); // cria um novo no
        if(this.head == null){//se a lista estiver vazia
            head = newNo;;
            tail = newNo;
            ++tam;
        }else{ //caso tenha algum item
            newNo.prox= head;
            newNo.ant = tail;
            head.ant = newNo;
            tail.prox = newNo;
            tail = newNo;
            ++tam;
        }
    }
    //Insere em outra posicao
    private void inserePosicao(T aluno, int posicao){
        if((posicao > this.tam)||(posicao < 1)){
            System.err.println("Posicao invalida, nao eh possivel inserir!!");
            System.exit(-1);
        }
        else if(posicao == tam){
            insereRear(aluno);
        }
        else{
            No<T> newNo = new No<T>(aluno);
            No<T> aux = head;
            int contador;

            for(contador=1; contador<(posicao -1);contador++){
                aux= aux.prox;
            }
            newNo.prox = aux.prox;
            newNo.ant = aux;
            aux.prox.ant = newNo;
            aux.prox = newNo;
        }
    }
     //Remove um item da frente da lista
     @Override
     public T removeFront(){
         if(head == null){
             System.err.println("Erro, a lista esta vazia!\n\n");
             System.exit(-1);
         }
 
         T temp = head.dadosT;
 
         if(head == tail){
             head = null;
             tail = null;
             tam = 0;
             return temp;
         }else{
             No<T> aux = head;
 
             head = aux.prox;
             head.ant = tail;
             tail.prox = head;
             aux = null;
             --tam;
             return temp;
         }
     }//Fim removeFront
 
     //Remove um item do final da lista
     @Override
     public T removeRear(){
         if(head == null){
            System.err.println("Erro, a lista esta vazia!\n\n");
             System.exit(-1);
         }
 
         T temp = tail.dadosT;
 
         if(head == tail){
             head = null;
             tail = null;
             tam = 0;
             return temp;
         }else{
             No<T> aux = tail;
 
             tail = aux.ant;
             tail.prox = head;
             head.ant = tail;
             aux = null;
             --tam;
             return temp;
         }
     }
 
     //Remove um item em uma posição especifica na lista
     @Override
     public T removePosicao(int posicao){
         if(head == null){
            System.err.println("Erro, a lista esta vazia!");
             System.exit(-1);
         }
 
         if((posicao > tam) || (posicao < 1)){
             System.err.println("Erro, posicao invalida!!");
             System.exit(-1);
         }
 
         if(posicao == 1){
             return removeFront();
         }else if(posicao == tam){
             return removeRear();
         }else{
             No<T> aux = head;
             
             for(int i = 1; i < posicao; i++){
                 aux = aux.prox;
             }
             T temp = aux.dadosT;
 
             aux.ant.prox = aux.prox;
             aux.prox.ant = aux.prox;
             aux = null;
             --tam;
             return temp;
         }
     }
 
     //Remove um item especifico da lista
     @Override
     public T removeItem(T a){
         No<T> item = procuraNo(head, a);
 
         if((getTam() == 1) || item == head){
             return removeFront();
         }else if(item == tail){
             return removeRear();
         }else{
             T temp = item.dadosT;
             item.ant.prox = item.prox;
             item.prox.ant = item.ant;
             item = null;
             --(this.tam);
             return temp;
         }
     }
 
     //Imprime a lista
     @Override
     public void imprimeList(){
         if(head == null){
             System.err.println("Erro, lista vazia!!");
             System.exit(-1);
         }
         imprimeNo(this.head, this.head);
     }
 
     //Imprime cada nó da lista
     private void imprimeNo(No<T> h1, No<T> h2){
         if(h1.prox == h2){
             System.out.println(h1.dadosT.toString());
             return;
         }
         System.out.println(h1.dadosT.toString());
         imprimeNo(h1.prox, h2);
     }
 
     //Procura um nó na lista
     private No<T> procuraNo(No<T> no, T a){
         if(no.dadosT.compareTo(a) == 0){
             return no;
         }
 
         if(no == this.tail){
             System.out.println("Dado nao encontrado!!");
             System.exit(-1);
         }
 
         return procuraNo(no.prox, a);
     }
    public void procuraNo(String nomeProfessor) {
    }

 }
