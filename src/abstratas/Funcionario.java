package abstratas;

public class Funcionario extends Pessoa {
	
	Pessoa p;

	public Pessoa Gravar() {
		p = new Pessoa() {
			
			@Override
			public Pessoa Gravar() {
				return p;
			}
		};
		p.setNome("Wellington");
		p.setIdade(21);
		p.setEmail("wellingtonbalbo@gmail.com");
		return p;
	}
	
	public static void main(String[] args) {
		System.out.println(new Funcionario().Gravar());
	}

}
