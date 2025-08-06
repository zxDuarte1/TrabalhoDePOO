public class Calango extends Animal
{
	
	Calango ( String nome, String cor, int membros){
		super(Alimentacao.ORNIVEROS,nome,cor,membros);
	}

	@Override
	public void alimentar()
	{
		System.out.println("Alimentado com inseto");
	}

	@Override
	public void EmitirSom()
	{
		System.out.println("Não Emitir som");
	}
	
}
