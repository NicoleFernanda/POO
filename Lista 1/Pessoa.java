package lista1;

public class Pessoa {
	
	private String nome;
	private char sexo;
	private String dataNascimento;
	private String estadoCivil;
	
	public Pessoa (String nome, char sexo, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.estadoCivil = "solteiro";
	}
	
	public Pessoa() {
		
	}
	
	public void imprimirPessoa() {
		System.out.println("nome = " + nome.toUpperCase());
		System.out.println("data de nascimento = " + dataNascimento);
		sexo = Character.toUpperCase(sexo);
		System.out.println("sexo = " + sexo);
		System.out.println("estado civil = " + estadoCivil.toUpperCase());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
}
