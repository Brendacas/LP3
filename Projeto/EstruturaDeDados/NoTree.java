// Classe para os nós da arvore binaria
public class NoTree<T>{
    T data; //Dado que a arvore recebe
    NoTree<T> pai; 
    NoTree<T> esq; //Filho esquerdo
    NoTree<T> dir; //Filho direito

    //Construtor
    public NoTree(){
        this.pai = null;
        this.esq = null;
        this.dir = null;
    }
}