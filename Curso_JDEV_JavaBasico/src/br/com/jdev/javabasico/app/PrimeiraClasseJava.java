package br.com.jdev.javabasico.app;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.jdev.javabasico.classes.Teste;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		JOptionPane.showInternalMessageDialog(null, "Olá Mundo!!");

		Teste test1 = new Teste();
		//Scanner scan = new Scanner(System.in);
		
		// nova tentativa de Commit
		
		int maxTentativas = 3;

		while (!test1.isAcessoPermitido()) {
			 for( int tentativa = 1; tentativa <= maxTentativas; tentativa++) {
				String senha = JOptionPane.showInputDialog("Digite sua Senha: ");
			 
					if (senha.equals(test1.getSenha())) {
						 JOptionPane.showMessageDialog(null,"Senha correta!");
						test1.setAcessoPermitido(true);
						break;
					}else {
						int restantes = maxTentativas - tentativa;
						JOptionPane.showMessageDialog(null, "Senha incorreta");
							if (restantes > 0) {
								JOptionPane.showMessageDialog(null, "Tentativas restantes " + restantes);	
							}
					}
			 }
			 
			 if (!test1.isAcessoPermitido()){
				 JOptionPane.showMessageDialog(null,"Acesso Bloquedo");
				 JOptionPane.showMessageDialog(null,"Aguarde 5 minutos.");
				
				 try {
					 Thread.sleep(300000);
					 
				 } catch (InterruptedException e){
					 Thread.currentThread().interrupt();
					 JOptionPane.showMessageDialog(null,"Espera interrompida. ");
					 return;
				 }
				 JOptionPane.showMessageDialog(null, "Bloqueio encerrado.");
				 JOptionPane.showMessageDialog(null,"Você pode tentar novamente.");
			 }
		}
		 test1.calcMedia(70, 70);
		 test1.aprovado();
	}

}
