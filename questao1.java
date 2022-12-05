package Exercicios;
import java.util.*;
/**
 *
 * @author castr
 */
public class Multimetro {
    public static void main(String[] args){
        Scanner INICIO = new Scanner(System.in);
        
        double voltagem[] = new double[10];
        double somaV = 0 ,somaS = 0;
        float media, desvio;
        
            for(int i = 0; i<10; i++){
            System.out.printf("Entre com a %d medicao ", i+1);
            voltagem[i] = INICIO.nextDouble();
            somaV = somaV + voltagem[i];
            }
            media = (float)(somaV/10);
        
        for(int i=0; i<10; i++){
        somaS = somaS + (voltagem[i] - media) * (voltagem[i] - media);
        }
        desvio = (float) Math.sqrt(somaS/10);
        
        for(int i =0; i<10; i++){
        System.out.printf("\nVoltagem %d: %f", i+1, voltagem[i]);
        }
        System.out.printf("\nA media das voltagens eh: %f", media);
        System.out.printf("\nO desvio eh: %f", desvio);
        
            if(desvio < (0.1 * media)){
                System.out.println("\nMultimetro esta apto para uso.");
            }
            else{
                System.out.println("\nMultimetro nao esta apto para uso.");
            }
    }
    
}