public class Calculadora {
    //Sobrecarga: Usando Mesmo nome, Mas pedindo diferentes quantidade e tipos de parametro...
    public int multiplicar(int num1,int num2){
        return num1 * num2;
    }
    public int multiplicar(int num1,int num2,int num3){
        return num1 * num2 * num3;
    }
    public double multiplicar(double num1,double num2,double num3){
        return num1 * num2 * num3;
    }
}
