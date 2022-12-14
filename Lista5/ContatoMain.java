package Lista5;

public class ContatoMain {
    public static void main(String[] args){
        Contato c1 = new Contato("Brenda Castro da Silva", "castrobrenda367@gmail.com", "73988715180", 28, 11, 2002);
        Contato c2 = new Contato("Brenda Castro da Silva", "73988715180", 28, 11, 2002);

        System.out.println(c1.getContador());
    }
}
