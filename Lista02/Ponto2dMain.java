package Lista2;

public class Ponto2dMain {
	public static void main(String[]args){
	       Ponto2d ponto = new Ponto2d();
	            
	       ponto.setX(0);
	       ponto.setY(1);
	            System.out.println(ponto.isEixoX());
	            System.out.println(ponto.isEixoY());
	            System.out.println(ponto.isEixos());
	            System.out.println(ponto.quadrante());
	            System.out.println(ponto.distancia(ponto));
	        }
	}


