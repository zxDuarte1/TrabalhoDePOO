public class Transporte {
    private float mediaDeVelocidade;
    private int limite;

    //Contrutor
    
    public Transporte(int limite, float mediaDeVelocidade){
        setLimite(limite);
        setMediaDeVelocidade(mediaDeVelocidade);
    }

    //Métodos
    public void caracteristicas(){
        System.out.println("Pessoas suportadas:"+getLimite());
        System.out.println("Velocidade Média Do transporte:"+getMediaDeVelocidade()+"Km");
    }
    //GETTERS AND SETERS

    public float getMediaDeVelocidade() {
        return this.mediaDeVelocidade;
    }

    public void setMediaDeVelocidade(float mediaDeVelocidade) {
        if (mediaDeVelocidade>0) {
            this.mediaDeVelocidade = mediaDeVelocidade;
        }
    }    
    public int getLimite() {
        return this.limite;
    }
    public void setLimite(int limite) {
        if (limite>0) {
            this.limite = limite;
        }
    }
}
