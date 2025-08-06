public class Barco extends Transporte {

    public Barco(int limite, float mediaDeVelocidade) {
        super(limite, mediaDeVelocidade);
    }

    //Métodos

    @Override
    public void caracteristicas() {
        System.out.println("********O Barco está navegando no mar********");
        super.caracteristicas();
    }
}
