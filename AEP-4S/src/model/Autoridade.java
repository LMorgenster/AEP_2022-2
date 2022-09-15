package model;

public class Autoridade {
	public String nome;
	public String numeroLigacao;
	public String endereco;
	
	public Autoridade(String nome, String numeroLigacao, String endereco) {
		this.nome = nome;
		this.numeroLigacao = numeroLigacao;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroLigacao() {
		return numeroLigacao;
	}
	public void setNumeroLigacao(String numeroLigacao) {
		this.numeroLigacao = numeroLigacao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
			   "Número para Ligação: " + numeroLigacao + "\n" +
			   "Endereço: " + endereco + "\n";
	}
}
