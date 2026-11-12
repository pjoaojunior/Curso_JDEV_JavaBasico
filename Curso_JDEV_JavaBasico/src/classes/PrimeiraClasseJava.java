package classes;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		System.out.println("Ola Mundo!!");
		JOptionPane.showInternalMessageDialog(null, "Olá Mundo!!");
		
		/*-----------------------------------------------------*/
		System.out.println("Testando A criação de nova Branch");
		
		Teste test1 = new Teste();
		test1.setNum1(10);
		test1.setNum2(2);
		System.out.println(test1.media(test1.getNum1(), test1.getNum2())); 
		
	}

}
