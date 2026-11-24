package entidades;

import java.time.LocalDate;

import Enum.CategoriaCNH;

public class ClientePessoaFisica extends Cliente {
	
	private final String cpf;
	private LocalDate dataNascimento;

	public ClientePessoaFisica(String nome, String telefone, Endereco endereco, String numeroCNH, CategoriaCNH categoriaCNH, String cpf, LocalDate dataNascimento) {
		super(nome, telefone, endereco, numeroCNH, categoriaCNH);
		
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override 
	public String getDocumento() {
		return cpf;
	}
	
	@Override
	public double getPercentualDesconto() {
		return 0.0; // Pessoa física não tem desconto
	}
	
}
