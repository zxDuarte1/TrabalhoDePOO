public class Celular extends Eletronico
{

	public void play()
	{
		if(ligado){
			System.out.println("Assintindo Reels");
		} else{
			System.out.println("esta desligado, ligue o Celular");
		}
	}
	
	public void Parar(){
			System.out.println("parar de assistir Reels");
		    this.desligar();
		    System.out.println("Desligando celular ");
	}
	
	

	@Override
	public void Configura()
	{
		System.out.println("Configurando Celular......");
	}

	
}
