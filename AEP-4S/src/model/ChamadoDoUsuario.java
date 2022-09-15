package model;

public class ChamadoDoUsuario {
	public String id;
	public String nome;
	public String idade;
	public String cpf;
	public String endereco;
	
	public ChamadoDoUsuario(String id, String nome, String idade, String cpf, String endereco) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\n" +
			   "Nome: " + nome + "\n" +
			   "Idade: " + idade + "\n" +
			   "CPF: " + cpf + "\n" +
			   "Endereço: " + endereco + "\n";
	}
}
