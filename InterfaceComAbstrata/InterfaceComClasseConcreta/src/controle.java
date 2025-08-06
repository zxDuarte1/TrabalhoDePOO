class Controle implements ControleMedia,ControleVolume
{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public void controle(){
		volume = 45;
		tocando = false;
		ligado = false;
	};
	
	//get e set
	private int getVolume(){
		return volume;
	}
	private void setVolume(int n){
		volume = n;
	}
	
	private boolean getLigado(){
		return ligado;
	}
	private void setLigado(boolean m){
		ligado = m;
	}
	
	private boolean getTocando(){
		return tocando;
	}
	private void setTocando(boolean b){
		tocando = b;
	}
	
	//metodos abstract
	@Override
	public void ligar(){
		this.setLigado(true);
	};
	@Override
	public void desligar(){
		this.setLigado(false);
	};
	@Override
	public void abrirMenu(){
		System.out.println("Esta ligado?:"+getLigado());
		System.out.println("Esta tocando?:"+getTocando());
		System.out.println("Volume:"+getVolume());
		
		for(int i = 1;i <= this.getVolume();i +=10){
			System.out.println("-");
		}
	};
	@Override
	public void fecharMenu(){
		System.out.println("fechado menu....");
	};
	
	public void maisVolume(){
		if(this.getLigado()){
			setVolume(getVolume()+5);
		}
	};
	@Override
	public void menosVolume(){
		if(this.getLigado()){
			this.setVolume(this.getVolume()-5);
		}
	};
	@Override
	public void ligarMudo(){
		if(this.getLigado() && this.getVolume() > 0 ){
			this.setVolume(0);
		}
	};
	@Override
	public void desligarMudo(){
		if(this.getLigado() && this.getVolume() <= 0 ){
			this.setVolume( 45 );
		}
	};
	@Override
	public void play(){
		if(this.getLigado() && !getTocando()){
			this.setTocando(true);
		}
	};
	@Override
	public void pause(){
		if(this.getLigado() && this.getTocando()){
			this.setTocando(false);
		}
	};
	
}//fim do codigo
