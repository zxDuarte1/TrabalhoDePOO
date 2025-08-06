public class Teste {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        System.out.println("---------------------------------------------------------");
        System.out.println("Multiplicação de 2 inteiros:"+calcular.multiplicar(10, 40));
        System.out.println("---------------------------------------------------------");
        System.out.println("Multiplicação de 3 inteiros:"+calcular.multiplicar(10, 40,20));
        System.out.println("---------------------------------------------------------");
        System.out.println("Multiplicação de 3 Doubles:"+calcular.multiplicar(2.5, 3.5,4.2));
        System.out.println("---------------------------------------------------------");
    }
}
