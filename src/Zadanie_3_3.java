import java.util.Random;
public class Zadanie_3_3 {

	public static void main(String[] args) {
		
		int i, j, min, max;
		
		Random r = new Random();
		int[][] tablica;
		tablica = new int[5][5];
		
		System.out.println("Wylosowana macierz: ");
		for (i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				tablica[i][j]=r.nextInt(11)-5;
				if (tablica[i][j]>=0) {
					System.out.print("  "+tablica[i][j]);
				}
				else {
					System.out.print(" "+tablica[i][j]);
				}
			}
			System.out.println("");
		}
		
		// min w wierszach, max w kolumnach
		
		System.out.println("Minimalne wartosci w wierszach:");
		for (i=0; i<5; ++i) {
			min=tablica[i][0];		
			for (j=0; j<5; j++) {
				if (tablica[i][j]<min) {
					min = tablica[i][j];
				}
			
			}
			System.out.println(i+": "+min);
		}
		
		
		max=tablica[0][1];
		min=tablica[0][4];
		for (i=0; i<5; i++) {
				if (tablica[i][i]>max) {
					max = tablica[i][i];
				}
				if (tablica[i][4-i]<min) {
					min = tablica[i][4-i];
				}
		}
		
		System.out.print("Maksimum na 1. przek¹tnej: "+max);
		System.out.println("");
		System.out.println("Minimum na 2. przekatnej: "+min);
		
		
		
		
		
		
		
	}

}
