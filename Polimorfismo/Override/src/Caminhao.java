public class Caminhao extends Transporte {

    public Caminhao(int limite,float mediaDeVelocidade){
        super(limite, mediaDeVelocidade);
    }
    //Métodos
    @Override
    public void caracteristicas() {
        System.out.println("********Caminhão está andando na estrada********");
        super.caracteristicas();
    }

}
