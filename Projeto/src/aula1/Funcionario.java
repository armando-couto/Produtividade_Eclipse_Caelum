package aula1;

import java.util.Calendar;

public class Funcionario {

	private String nome;
	private int idade;
	private Calendar dataNascimento;
	
	public Funcionario() {}
	
	public Funcionario(String nome, int idade, Calendar dataNascimento) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}