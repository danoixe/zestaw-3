import java.util.Random;
				
public class Zadanie_3_2 {

	public static void main(String[] args) {
		
				int i, a, max, min, j, k=0;
				double sum, sr;
				
				Random r = new Random();
				int[] tablica;
				tablica = new int[20];
				
				System.out.println("Wylosowane liczby:");
				for (i=0; i<10; i++) {
					tablica[i]=r.nextInt(10)+1;
					System.out.print(tablica[i]+" ");
				}
				System.out.println("");
				System.out.println("Wyst¹pienia: ");
				
				for (i=1; i<=10; i++) {
					k=0;
					for (j=0; j<10; j++) {
						if (tablica[j]==i) {
							k++;
						}
					}
					System.out.println(i+" x "+k);
				}

	}

}
