package nizovi;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji sa standardnog ulaza ucitava duzinu i elemente niza koji su tipa int.
Zatim niz proslediti metodi koja treba da proveri da li je niz palindrom ili nije. Na standradnom izlazu obavestiti krajnjeg korisnika njemu
razumljivim tekstom da li je unesen niz palindrom.
Primer ucitanog niza koji je palindrom: 12 46 17 46 12
Primer ucitanog niza koji nije palindrom: 12 46 17 12 64
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj clanova niza: ");
		int duzina = sc.nextInt();
		int[] niz = new int[duzina];
		System.out.println("Unesite elemente niza: ");
		for(int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		
		palindrom(niz);
	}

	public static void palindrom(int[] a) {
		boolean palindrom = true;
		
		for(int i = 0; i < a.length / 2; i++) {
			if(a[i] != a[a.length - i - 1]) {
				System.out.println("Uneti niz nije palindrom.");
				palindrom = false;
				break;
			}
		}if(palindrom) {
			System.out.println("Uneti niz je palindrom.");
		}
	}
}
