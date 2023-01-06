//Interface da classe list
public interface ListInterface<T>{
    T removeFront();
    T removeRear();
    T removePosicao(int posicao);
    void imprimeList();
    T removeItem(T a);
}