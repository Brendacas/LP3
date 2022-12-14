package Lista6;

public class DataHoraMain{
     public static void main(String[] args){

    DataHora d1 = new DataHora(28, 11, 2022, 7, 15, 20);
    DataHora d2 = new DataHora(28, 11, 2002, 10 35, 52);

    System.out.println(d1.toString());
    System.out.println(d2.toString());

    System.out.println(d1.isEqual(d2));
    System.out.println(d1.isGreather(d2));
    System.out.println(d1.isLower(d2));
} 
    
}
