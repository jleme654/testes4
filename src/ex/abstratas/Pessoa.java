package ex.abstratas;

public abstract class Pessoa {

	public String Nome;
	public int Idade;
	public String Email;

	public abstract Pessoa Gravar();

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", Idade=" + Idade + ", Email=" + Email + "]";
	}

}
