package br.com.jdev.javabasico.app;


import javax.swing.JOptionPane;

import br.com.jdev.javabasico.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		JOptionPane.showInternalMessageDialog(null, "Olá Mundo!!");

		Aluno aluno1 = new Aluno();
			
		int maxTentativas = 3;

		while (!aluno1.isAcessoPermitido()) {
			 for( int tentativa = 1; tentativa <= maxTentativas; tentativa++) {
				String senha = JOptionPane.showInputDialog("Digite sua Senha: ");
			 
					if (senha.equals(aluno1.getSenha())) {
						 JOptionPane.showMessageDialog(null,"Senha correta!");
						aluno1.setAcessoPermitido(true);
						break;
					}else {
						int restantes = maxTentativas - tentativa;
						JOptionPane.showMessageDialog(null, "Senha incorreta");
							if (restantes > 0) {
								JOptionPane.showMessageDialog(null, "Tentativas restantes " + restantes);	
							}
					}
			 }
			 
			 if (!aluno1.isAcessoPermitido()){
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
		aluno1.setNota1(70);
		aluno1.setNota2(50);
		 aluno1.calcMedia();
		 aluno1.aprovado();
	}

}
