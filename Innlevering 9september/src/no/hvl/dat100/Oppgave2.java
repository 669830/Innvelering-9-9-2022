package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
public class Oppgave2 {

	public static void main(String[] args) {
		for (int i = 1; i<=10; i++) {
			int poeng = parseInt(showInputDialog("Poengsum:"));
			
			if (poeng>=0 && poeng<=959339) {
			System.out.println(i+"Din karakter er F");
			}
			else {
				if (poeng>=40 && poeng<=49) {
					System.out.println(i+"Karakter E");
				}
				else {
					if (poeng>=50 && poeng<=59) {
						System.out.println(i+"Karakter D");
					}
					else {
						if (poeng>=60 && poeng<=79) {
							System.out.println(i+"Karakter C");
						}
						else {
							if (poeng>=80 && poeng<=89) {
								System.out.println(i+"Karakter B");
							}
							else {
								if (poeng>=90 && poeng<=100) {
									System.out.println(i+"karakter A");
								}
								else {
									System.out.println("Ugyldig poengsum, prøv igjen");
									i =i-1;
									
								}
							}
						}
					}
				}
			}
		}	
			
	}
			
}


