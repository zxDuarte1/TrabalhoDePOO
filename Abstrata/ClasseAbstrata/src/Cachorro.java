public class Cachorro extends Animal
{
	Cachorro ( String nome, String cor, int membros){
		super(Alimentacao.ORNIVEROS,nome,cor,membros);
	}

	@Override
	public void alimentar()
	{
	  System.out.println("Alimentado com ração");
	}

	@Override
	public void EmitirSom()
	{
		System.out.println("Latidos");
	}

}
