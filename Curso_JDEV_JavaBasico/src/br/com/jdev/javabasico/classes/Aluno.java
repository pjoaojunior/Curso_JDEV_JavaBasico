package br.com.jdev.javabasico.classes;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Aluno {
	private String nome;
	private String dtNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dtMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private String genero;
	private int idade;
	private double nota1, nota2;
	private double media;
	private boolean acessoPermitido = false;
	private String senha = "admin";

	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDtMatricula() {
		return dtMatricula;
	}

	public void setDtMatricula(String dtMatricula) {
		this.dtMatricula = dtMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public boolean isAcessoPermitido() {
		return acessoPermitido;
	}

	public void setAcessoPermitido(boolean acessoPermitido) {
		this.acessoPermitido = acessoPermitido;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}

	public double calcMedia() {
		this.setMedia((nota1 + nota2) / 2);
		return media;
	}

	public void aprovado() {
		if (this.getMedia() >= 50) {
			if (this.getMedia() >= 70) {
				JOptionPane.showMessageDialog(null, "Média do aluno: " + this.getMedia() + ": Aprovado");
			} else {
				JOptionPane.showMessageDialog(null, "Média do aluno: " + this.getMedia() + ": Recuperação");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Média do aluno: " + this.getMedia() + ": Reprovado");
		}
	}

	public boolean aprovado2() {
		if (this.getMedia() >= 70) {
			return true;
		} else {
			return false;
		}
	}

}
