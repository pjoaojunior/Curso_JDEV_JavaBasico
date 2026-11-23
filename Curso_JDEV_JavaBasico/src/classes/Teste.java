package classes;

import javax.swing.JOptionPane;

public class Teste {
	private double a;
	private double b;
	private double c;
	private double delta;
	private double x1;
	private double x2;
	private int nota1, nota2;
	private double media;
	private String senha = "admin";
	private boolean acessoPermitido = false;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean isAcessoPermitido() {
		return acessoPermitido;
	}

	public void setAcessoPermitido(boolean acessoPermitido) {
		this.acessoPermitido = acessoPermitido;
	}

	public Teste() {
		super();
	}

	public double calcMedia(int nota1, int nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = (double) (this.nota1 + this.nota2) / 2;
		return media;
	}

	public void aprovado() {
		if (this.getMedia() >= 50) {
			if (this.getMedia() >= 70) {
				JOptionPane.showMessageDialog(null, "Média do aluno: " + this.getMedia() + ": Aprovado");
			} else {
				JOptionPane.showMessageDialog(null,"Média do aluno: " + this.getMedia() + ": Recuperação");
			}
		} else {
			JOptionPane.showMessageDialog(null,"Média do aluno: " + this.getMedia() + ": Reprovado");
		}
	}

	

}
