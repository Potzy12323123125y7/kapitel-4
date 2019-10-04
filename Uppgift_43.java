/*
 Övning 4.3
 Skapat 2019-10-04
 Programmerare Alexander jonsson näslund
*/
import javax.swing.*;
import java.util.Scanner;

public class Uppgift_43 { 
	public static void main(String[] args) {
			double poäng;
			poäng = Double.parseDouble (JOptionPane.showInputDialog(null,"Poäng för elev"));
			int A = 45;
			int B = 40;
			int C = 35;
			int D = 30;
			int E = 25;
			
			if (50 < poäng) {
							JOptionPane.showMessageDialog(null, "Poängen som angavs är ej giltig");
			}
			else if (poäng >= A){
			JOptionPane.showMessageDialog(null, "eleven har A i betyg");
			}
				else if (poäng >= B) {
JOptionPane.showMessageDialog(null, "eleven har B i betyg");
				}
				else if (poäng >= C) {
		JOptionPane.showMessageDialog(null, "eleven har C i betyg");
	}
			else if (poäng >= D ){
				JOptionPane.showMessageDialog(null, "eleven har D i betyg");
			}
			else if (poäng >= E) {
				JOptionPane.showMessageDialog(null, "eleven har E i betyg");
			}
			else if (25 >= poäng) {
			JOptionPane.showMessageDialog(null, "eleven har F i betyg");	
			}
			else {
				JOptionPane.showMessageDialog(null, "Poänget du angav är ogiltigt");
			} 
				
	}

}