import java.util.Scanner;

public class Zadanie_3_5 {

	public static void main(String[] args) {
		int a, b, i, j=0, k=0;
		
		System.out.print("Podaj liczbê: ");
		Scanner r = new Scanner(System.in);
		a = r.nextInt();
		b=a;
		
		int [] tablica;
		tablica = new int[32];
		
		if (a<0) {
			a=-a;
		}
		
		for (i=0; i<32; i++) {
			tablica[i]=a%2;
			a=a/2;
			j++;
			if (a==0) {
				break;
			}
		}
		
		// ZM
		System.out.println("");
		System.out.print("Liczba "+b+" binarnie: ");
		if (b>=0) {
			System.out.print(0+".");
		}
		else {
			System.out.print(1+".");
		}
		for (i=0; i<j; i++) {
			System.out.print(tablica[j-i-1]);
		}
		
		// ZU1
		System.out.println("");
		System.out.print("Liczba "+b+" w ZU1: ");
		if (b>=0) {
			System.out.print(0+".");
			for (i=0; i<j; i++) {
				System.out.print(tablica[j-i-1]);
			}
		}
		
		else {
			System.out.print(1+".");
		
		for (i=0; i<j; i++) {
			if (tablica[j-i-1]==0) {
				System.out.print(1);
			}
			else {
				System.out.print(0);
			}
		}	
		}
		
		// ZU2
		for (i=0; i<j; i++) {
			k++;
			if (tablica[i]==1) {
				break;
			}
		}
		System.out.println("");
		System.out.print("Liczba "+b+" w ZU2: ");
		if (b>=0) {
			System.out.print(0+".");
			for (i=0; i<j; i++) {
				System.out.print(tablica[j-i-1]);
			}			
		}
		else {
			System.out.print(1+".");
		
		for (i=k; i<j; i++) {
			if (tablica[i]==0) {
				tablica[i]=1;
			}
			else {
				tablica[i]=0;
			}
		}
		for (i=0; i<j; i++) {
			System.out.print(tablica[j-i-1]);
		}
		}		
		

	}
 
}