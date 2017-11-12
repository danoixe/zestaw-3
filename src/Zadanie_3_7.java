import java.util.Scanner;
import java.util.Random;

public class Zadanie_3_7 {

	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		
		int n, i, j, w, k, z=0, m=0, tw, tk, t, s=0;

		System.out.println("Podaj rozmiar tablicy: ");
		n = r.nextInt();
		
		System.out.println("Podaj liczbê iteracji: ");
		t = r.nextInt();
		
		int[][] tab = new int[n][n]; // kolejny stan
		int[][] tab0 = new int[n][n]; // bie¿¹cy stan
		
		Random los = new Random();

		  for (i=0; i<n; i++) {
			  for (j=0; j<n; j++) {
					  tab0[i][j]=los.nextInt(2);
				  }
		  }
		  
			System.out.println("Wylosowana macierz: ");
			for (i=0; i<n; i++) {
				for (j=0; j<n; j++) {
						System.out.print(" "+tab0[i][j]);	
				}
				System.out.println("");
			}
		  
		  while (s < t) {
		  
		  for (i=0; i<n; i++) {
			for (j=0; j<n; j++) {
				
				for (w=i-1; w<=i+1; w++) {
					tw=w;
					if (w<0) { 
						w = n-1;
					}
					else if (w>n-1) {
						w = 0;
					}
					for (k=j-1; k<=j+1; k++) {
						tk = k;
						if (k<0) { 
							k = n-1;
						}
						else if (k>n-1) {
							k = 0;
						}
						if (tab0[w][k]==1 && (w!=i || k!=j)) {
							z++;
						}
						else if ((w!=i || k!=j)) {
							m++;
						}
						
						k=tk;
					}
					w=tw;
				}
				if (tab0[i][j]==0 && z==3) {
					tab[i][j]=1;	
				}
				else if (tab0[i][j]==1 && z==2 || tab0[i][j]==1 && z==3) {
					tab[i][j]=1;
				}
				else if (tab0[i][j]==1) {
					tab[i][j]=0;
				}
				else {
					tab[i][j]=tab0[i][j];
				}
				z=0;
				m=0;
			}
		}
		

		
		System.out.println("I iteracja ");
			for (i=0; i<n; i++) {
				for (j=0; j<n; j++) {
						System.out.print(" "+tab[i][j]);	
				}
				System.out.println("");
			}

			tab0=tab;
			s++;
		  }
	}

}
