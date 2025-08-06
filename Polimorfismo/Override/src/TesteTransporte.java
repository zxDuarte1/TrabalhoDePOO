public class TesteTransporte {
    public static void main(String[] args) {

        //Objetos

        Barco barco = new Barco(40, 30);
        Aviao aviao = new Aviao(55,900);
        Caminhao carro =new Caminhao(5, 70);

        //Características

        barco.caracteristicas();
        System.out.println("-----------------------------------------");
        aviao.caracteristicas();
        System.out.println("-----------------------------------------");
        carro.caracteristicas();
        System.out.println("-----------------------------------------");
        
    }
}
