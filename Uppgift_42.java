/*
 Övning 4.2
 Skapat 2019-10-03
 Programmerare Alexander jonsson näslund
*/
import javax.swing.*;
import java.util.Scanner;

public class Uppgift_42 { 
	public static void main(String[] args) {
		double kort;
		double biljett;
		kort = Double.parseDouble (JOptionPane.showInputDialog(null,"kostnad för årskort"));
		biljett = Double.parseDouble (JOptionPane.showInputDialog(null,"kostnad för engångs biljett"));
double s;
s = Double.parseDouble (JOptionPane.showInputDialog(null,"hur ofta går du på gymmet? per månad"));
	if (s * 12 > kort) 
		JOptionPane.showMessageDialog(null,"Du borde köpa årkort");
	else 
		JOptionPane.showMessageDialog(null, "Du borde köpa engångs biljetter");
	
	}
}