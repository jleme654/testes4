package ex.abstratas;

public class Funcionario2 extends Pessoa2 {

	public void Gravar() {
		Nome = "Wellington";
		Idade = 21;
		Email = "wellingtonbalbo@gmail.com";
		
		StringBuilder sb = new StringBuilder();
		sb.append("nome: "+Nome + "\n");
		sb.append("idade: "+Idade + "\n");
		sb.append("email: "+Email + "\n");
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		new Funcionario2().Gravar();
	}

}
