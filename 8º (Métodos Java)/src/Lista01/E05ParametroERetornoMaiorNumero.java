package Lista01;

public class E05ParametroERetornoMaiorNumero {
    
    static int MaiorNumero(int num1, int num2){
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    public static void main(String[] args){
        System.out.println("O maior número entre 20 e 10 é:" + MaiorNumero(20, 10));
        System.out.println("O maior número entre 12 e 123 é:" + MaiorNumero(12, 123));

    }
}
