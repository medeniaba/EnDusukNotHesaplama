import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Endusuknot {
	public static void main(String[] args) {
		Scanner klavye = new Scanner ( System.in);
		Random a = new Random();
        int dizi[] = new int [20];
       
        System.out.println("Sınıfın Notları ");
        for ( int i = 0 ; i < dizi.length ; i++) {
		dizi [i] = a.nextInt(100);
					System.out.println ( dizi[i]);
					
	        }
        System.out.println(" Dizinin en kücük 5 hanesi ; \n ");
        Arrays.sort (dizi);
        for ( int i = 0 ; i < 5 ; i++) {
	 

        	System.out.println(dizi[i]);
		 
	 }
	 
		
	}}


