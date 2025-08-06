public abstract class Eletronico implements Controlador
{
	
	protected boolean ligado = false;
	protected int volume;
	

	
	// Metodos da Interface
	@Override
	public void ligar()
	{
		this.ligado = true;
	}

	@Override
	public void desligar()
	{
		this.ligado = false;
	}

	@Override
	public void maisVolume(int num)
	{
		if(num <= 100 || num >= 0){
			this.volume += num;
		}
	}

	@Override
	public void menosVolume(int num)
	{
		if(num <= 100 || num >= 0){
			this.volume -= num;
		}
	}
	
	//metodos abtratos
	public abstract void Configura();
	
	//metodos
	
	public void detalhes(){
		System.out.println("Ligado:");
		System.out.println("Volume:");
	}
	
	
	
}
