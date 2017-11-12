import java.util.Random;
public class Zadanie_3_1 {

	public static void main(String[] args) {
		
		int i, a, max, min, j, k;
		double sum, sr;
		
		Random r = new Random();
		int[] tablica;
		tablica = new int[10];
		
		for (i=0; i<10; i++) {
			tablica[i]=r.nextInt(21)-10;
			System.out.print(tablica[i]+" ");
		}
		
		max = tablica[1];
		min = tablica[1];
		sum = 0;
		
		// maksimum i minimum, suma
		for (i=0; i<10; i++) {
			if (tablica[i]>max) {
				max = tablica[i];
			}
			if (tablica[i]<min) {
				min = tablica[i];
			}
			sum = sum + tablica[i];
		
		}
		
		sr=sum/tablica.length;
			
		System.out.println("");
		System.out.println("Max: "+max+", min: "+min);
		System.out.println("Œrednia: "+sr);
		
		//wieksze i mniejsze od sredniej
		j=0; k=0;
		for (i=0; i<10; i++) {
			if (tablica[i]>sr) {
				j++;
			}
			else {
				k++;
			}
		}
		
		System.out.println("Wieksze od sredniej: "+j);
		System.out.println("Mniejsze od sredniej: "+k);
		System.out.println("Liczby w odwrotnej kolejnosci: ");
		
		//odwrotna kolejnosc
		for (i=0; i<10; i++) {
			System.out.print(tablica[10-i-1]+" ");
		}
		

	}
}


