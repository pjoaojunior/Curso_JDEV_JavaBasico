package classes;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		System.out.println("Ola Mundo!!");
		JOptionPane.showInternalMessageDialog(null, "Olá Mundo!!");
		
		Teste test1 = new Teste();
		
		test1.calculoBaskara(1, 2, 6);
		}

}
