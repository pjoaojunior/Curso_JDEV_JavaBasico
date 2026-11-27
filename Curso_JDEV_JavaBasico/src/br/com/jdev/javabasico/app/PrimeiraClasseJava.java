package br.com.jdev.javabasico.app;

import javax.swing.JOptionPane;

import br.com.jdev.javabasico.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		JOptionPane.showInternalMessageDialog(null, "Olá Mundo!!");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(JOptionPane.showInputDialog(null,"Digite o nome do aluno."));
		aluno1.setDtNascimento((JOptionPane.showInputDialog(null,"Digite sua data de nascimento.")));
		aluno1.setRegistroGeral((JOptionPane.showInputDialog(null,"Digite ser RG.")));
		aluno1.setNumeroCpf((JOptionPane.showInputDialog(null,"Digite o numero do seu CPF.")));
		aluno1.setGenero(JOptionPane.showInputDialog(null,"Digite seu Genero."));
		aluno1.setNomeMae((JOptionPane.showInputDialog(null,"Digite o nome de sua Mãe.")));
		aluno1.setNomePai (JOptionPane.showInputDialog(null,"Digite o nome do seu Pai."));
		aluno1.setSerieMatriculado(JOptionPane.showInputDialog(null,"Digite a série do ALuno."));
		aluno1.setDtMatricula(JOptionPane.showInputDialog(null, "Digite a data da matricula."));
		
		aluno1.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null, "digite a 1ª nota: ")));
		aluno1.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null, "digite a 2ª nota: ")));
		aluno1.calcMedia();
		aluno1.aprovado();
		JOptionPane.showMessageDialog(null, aluno1);
	}

}
