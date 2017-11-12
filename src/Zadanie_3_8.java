import java.util.Scanner;

public class Zadanie_3_8 {

	public static void main(String[] args) {
		
		int la, lb, ma, mb, i, j=1, l=1, t1, t2, k=0, m, t=0, reszta=0;
		Scanner r = new Scanner(System.in);
		System.out.print("Podaj licznik pierwszego u³amka: ");
		la = r.nextInt();
		t1 = la;
		System.out.print("Podaj mianownik pierwszego u³amka: ");
		ma = r.nextInt();
		System.out.print("Podaj licznik drugiego u³amka: ");
		lb = r.nextInt();
		t2 = lb;
		System.out.print("Podaj mianownik drugiego u³amka: ");
		mb = r.nextInt();
		
		// pierwszy ulamek
		i = 2;
		while (i<ma) {
			i = i*2;
			j++;
		}
		
		int [] tablica = new int[j];
		
		if (la<0) {
			la=-la;
		}
		for (i=0; i<j; i++) {
			tablica[j-i-1]=la%2;
			la=la/2;
			if (la==0) {
				break;
			}
		}
		
		for (i=0; i<j; i++) {
			k++;
			if (tablica[j-i-1]==1) {
				break;
			}
		}
		System.out.println("");
		System.out.print("1 liczba w ZU2: ");
		if (t1>=0) {
			System.out.print(0+".");
			for (i=0; i<j; i++) {
				System.out.print(tablica[i]);
			}			
		}
		else {
			System.out.print(1+".");
		
		for (i=0; i<j-k; i++) {
			if (tablica[i]==0) {
				tablica[i]=1;
			}
			else {
				tablica[i]=0;
			}
		}
		for (i=0; i<j; i++) {
			System.out.print(tablica[i]);
		}
		}		

		
		
		// drugi ulamek
		i = 2;
		l = 1;
		while (i<mb) {
			i = i*2;
			l++;
		}
		
		int [] tablica2 = new int[l];
		
		if (lb<0) {
			lb=-lb;
		}
		for (i=0; i<l; i++) {
			tablica2[l-i-1]=lb%2;
			lb=lb/2;
			if (lb==0) {
				break;
			}
		}
		
		k=0;
		for (i=0; i<l; i++) {
			k++;
			if (tablica2[l-i-1]==1) {
				break;
			}
		}
		System.out.println("");
		System.out.print("2 liczba w ZU2: ");
		if (t2>=0) {
			System.out.print(0+".");
			for (i=0; i<l; i++) {
				System.out.print(tablica2[i]);
			}			
		}
		else {
			System.out.print(1+".");
		
		for (i=0; i<l-k; i++) {
			if (tablica2[i]==0) {
				tablica2[i]=1;
			}
			else {
				tablica2[i]=0;
			}
		}
		for (i=0; i<l; i++) {
			System.out.print(tablica2[i]);
		}
		}
		
		int [] tablicaA = new int[j+1];
		tablicaA[0]=0;
		for (i=1; i<j+1; i++) {
			tablicaA[i]=tablica[i-1];
		}
		
		
		int [] tablica3 = new int[j+l];
		
		for (i=0; i<j+l; i++) {
			tablica3[i]=0;
		}
		
		for (i=l-1; i>=0; i--) {
			if (tablica2[i] == 1) {
				for (m=j; m>=0; m--) {
					t=tablica3[m]+tablicaA[m]+reszta;
		            tablica3[m] = t % 2;
		            reszta = t / 2;
					
		            tablicaA[0]=0;
					for (m=tablicaA.length-1; m>=1; m--) {
						tablicaA[m]=tablicaA[m-1];
					}
				}
			}
			else {
				tablicaA[0]=0;
				for (m=tablicaA.length-1; m>=1; m--) {
					tablicaA[m]=tablicaA[m-1];
				}
			
			}
		}
		
		
		
	}

}
