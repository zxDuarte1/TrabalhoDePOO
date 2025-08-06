public enum Alimentacao
{
	CARNIVOROS("Carnivoro"),HERBIVOROS("Herbivoro"),ORNIVEROS("Ornivoro");
	
	String descricao;
	
	Alimentacao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	
}
