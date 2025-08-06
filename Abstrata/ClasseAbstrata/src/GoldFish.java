public class GoldFish extends Animal
{
	
	GoldFish ( String nome, String cor, int membros){
		super(Alimentacao.HERBIVOROS,nome,cor,membros);
	}

	@Override
	public void alimentar()
	{
		System.out.println("Alimentado com raçao");
	}

	@Override
	public void EmitirSom()
	{
		System.out.println("Não Emitir som");
	}
	
}
