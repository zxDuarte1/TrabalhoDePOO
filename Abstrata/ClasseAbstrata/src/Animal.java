public abstract class Animal
{
	// classe abstrata serve como base para criar outras classes
	// essas classes tem quer obrigatoriamente implementa os metodos Abstratos
	
	protected String nome;
	protected String cor;
	private int membros;
	protected Alimentacao alimentacao;
	
	
	// Construtor
    Animal ( Alimentacao alimentacao, String nome, String cor, int membros){
		this.alimentacao = alimentacao;
		this.nome = nome;
		this.cor = cor;
		this.membros = membros;
	}
	
	// metodos
	
	public void  detalhes(){
		System.out.println("Nome:"+this.nome);
		System.out.println("Cor:"+this.cor);
		System.out.println("Quantidade de Membros:"+this.membros);
		System.out.println("Tipo de Alimentação:"+alimentacao.getDescricao());
	}
	
	public abstract void alimentar();
	public abstract void EmitirSom();
	
	// get e set
	
	public int getMembros(){
		return this.membros;
	}
	public void setMembros(int membros){
		this.membros = membros;
	}
	
}
