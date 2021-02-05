import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int x,y;
    System.out.println("Digite um numero inteiro");
    x = sc.nextInt();
    System.out.println("Digite outro numero inteiro");
    y = sc.nextInt();
    if (x%y==0) {
       System.out.println("Numeros são multiplos entre si");
    }else if(y%x==0) {
       System.out.println("Numeros sao multiplos entre si");	
    }else {
      System.out.println("Numeros não sao multiplos entres si");
    }
    
   
    
    sc.close();
	}
  
}
