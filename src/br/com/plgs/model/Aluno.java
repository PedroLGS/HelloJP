package br.com.plgs.model;

public class Aluno extends Pessoa {

	//atributos
	private String matricula;
	private int anoMatricula;
	
	//construtor
	public Aluno(String matricula, int anoMatricula,
				 String nome, String telefone, String email
			) {
		super(nome, telefone, email);
		this.matricula = matricula;
		this.anoMatricula = anoMatricula;
	}

	// get e set
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnoMatricula() {
		return anoMatricula;
	}

	public void setAnoMatricula(int anoMatricula) {
		this.anoMatricula = anoMatricula;
	}
	
	@Override
	public String toString() {
		return "[Matricula: "     + this.matricula +      ", " +
				"Ano Matricula: " + this.anoMatricula +   ", " +
				"Nome: "          + super.getNome() +     ", " +
				"Telefone: "      + super.getTelefone() + ", " +
				"E-mail: "        + super.getEmail() +    "]";
	} 
	
}
