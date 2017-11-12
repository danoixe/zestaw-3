import java.util.Scanner;
public class Zadanie_3_6 {

	public static void main(String[] args) {
		
		int n, k, i, j, s=0;
		
		Scanner r = new Scanner(System.in);
		System.out.print("Podaj liczbê ca³kowit¹ dodatni¹: ");
		n = r.nextInt();
		
		boolean[][] tablica = new boolean[n][n];
		
		for (i=0; i<n; i++) {
			for (j=0; j<n; j++) {
				if(i<=j) {
				for (k=2; k<=i+1; k++) {
					if ((i+1)%k==0 && (j+1)%k==0) {
						s++;
					}
				}
					if (s>0) {
						tablica[i][j] = false;
					}
					else {
						tablica[i][j] = true;
					}
					s=0;
				}
				
				else {
					for (k=2; k<=j+1; k++) {
						if ((i+1)%k==0 && (j+1)%k==0) {
							s++;
						}
					}
						if (s>0) {
							tablica[i][j] = false;
						}
						else {
							tablica[i][j] = true;
						}
						s=0;
				}
				
			}
		}
				
				// wyswietlenie macierzy
				for (i=0; i<n; i++) {
					for (j=0; j<n; j++) {
						if (tablica[i][j]==true) {
							System.out.print("+ ");
						}
						else {
							System.out.print(". ");
						}
					}
					System.out.println("");
				}
				

	}

}
