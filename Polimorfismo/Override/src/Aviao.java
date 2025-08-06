public class Aviao extends Transporte {

    public Aviao(int limite,float mediaDeVelocidade){
        super(limite,mediaDeVelocidade);
    }
    //Métodos
    @Override
    public void caracteristicas() {
        System.out.println("********O avião está voando sobre a cidade********");
        super.caracteristicas();
    }
}
