package nizovi;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji izracunava proizvod elemenata niza tipa int, koji su
		 * veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno
		 * metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza. Primer
		 * ucitanog niza: 3 7 1 4 2 5 Primer izracunatog proizvoda:84
		 */
		int[] niz = unosNiza();
		proizvod(niz);
	}

	public static int[] unosNiza() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza: ");
		int[] niz = new int[sc.nextInt()];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza.");
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static void proizvod(int[] niz) {
		int proizvod = 1;
		int brojVecihElemenata = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > i) {
				brojVecihElemenata++;
				proizvod = proizvod * niz[i];
			}
		}
		if (brojVecihElemenata == 0) {
			System.out.println("U nizu nema elemenata koji su veci od svog indeksa.");
		} else {
			System.out.println("Proizvod elemenata koji su veci od svog indeksa je: " + proizvod);
		}
	}
}
