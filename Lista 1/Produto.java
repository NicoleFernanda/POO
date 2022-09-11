package lista1;

public class Produto {
	
	private String nome;
	private String descricao;
	private float preco;
	private float desconto;
	
	public String toString() {
		return nome + " : " + descricao + "\nR$:" + preco + "\ndesconto de " + desconto + "\npreco total = " + (preco - desconto);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	
}
