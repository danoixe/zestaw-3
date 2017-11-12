import java.util.Scanner;

public class Zadanie_3_4 {

	public static void main(String[] args) {
		
		int i, j=0, t;
		
		System.out.println("Podaj liczbê");
		Scanner r = new Scanner(System.in);
		int a = r.nextInt();
		t = a;
		
		int [] tablica;
		tablica = new int[32];
		
		for (i=0; i<32; i++) {
			tablica[i]=a%2;
			a=a/2;
			j++;
			if (a==0) {
				break;
			}
		}
		
		System.out.println("Liczba "+t+" binarnie: ");
		if (a>=0) {
			System.out.print(0+".");
		}
		else {
			System.out.print(1+".");
		}
		for (i=0; i<j; i++) {
			System.out.print(tablica[j-i-1]);
		}

	}

}
