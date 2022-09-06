package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.*;

public class Oppgave1 {
	
	public static void main(String[] args) {
	int brutto= parseInt(showInputDialog("Bruttolønn"));
	
	if (brutto>0 && brutto<164100) {
		double a = 0;
		double b = brutto * a;
		double c = brutto - b;
		int i = (int)c;
		System.out.println("Trinnskatt:/n "+i+" nok");
	}
	else {
		if (brutto>164101 && brutto<230950) {
			double a = 0.0093;
			double b = brutto *a;
			double c = brutto -b;
			int i = (int)c;
			System.out.println("Trinnskatt:/n "+i+" nok");
			
		}
		else {
			if (brutto>230951 && brutto<580650) {
				double a = 0.0241;
				double b = brutto * a;
				double c = brutto - b;
				int i = (int)c;
				System.out.println("Trinnskatt:/n "+i+" nok");
				
			}
			else {
				if (brutto>580651 && brutto<943050) {
					double a = 0.1152;
					double b = brutto * a;
					double c = brutto - b;
					int i= (int)c;
					System.out.println("trinnskatt:/n "+i+" nok");
				}
				else {
					if(brutto>=934051) {
						double a = 0.1452;
						double b = brutto * a;
						double c = brutto - b;
						int i = (int)c;
						System.out.println("\"Trinnskatt:/n "+i+" nok");
					}
					else {
						System.out.println("Sum ugyldig");
					}
					
				}
			}
		}
	}
}
}
