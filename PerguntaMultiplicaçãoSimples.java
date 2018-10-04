package multiplicacao;
import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplicacao {
        private static final SecureRandom numerosAleatorios = new SecureRandom();

    public static void main(String[] args)
    {
       int num1 = 1 + numerosAleatorios.nextInt(9); 
       int num2 = 1 + numerosAleatorios.nextInt(9); 
       
       System.out.println("Quanto é " + num1 + " vezes " + num2 + " ?");     
       
       int conta = num1 * num2; 
       
       Scanner entrada = new Scanner(System.in);
       int resposta;
        
       System.out.println("Digite sua resposta: ");
       resposta = entrada.nextInt();
       
       if(conta == resposta){
           System.out.println("Acerto!");
       }else{
           while(resposta != conta){
               System.out.println("Errado. Tente novamente");
               System.out.println("Quanto é " + num1 + " vezes " + num2 + " ?");
               resposta = entrada.nextInt();
           }
           System.out.println("Acerto!");
       }
    }
 }
